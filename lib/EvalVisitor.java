package com.shawnrebello.baritsu.lib;

import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import com.shawnrebello.baritsu.antlr.*;
import java.lang.reflect.Method;


public class EvalVisitor extends BaritsuBaseVisitor {
  Environment globalEnv = new Environment("__GLOBAL__");
  Variable globals = globalEnv.getEnvironmentVariables();

  @Override
  public Object visitVariable_declaration(BaritsuParser.Variable_declarationContext ctx) {
    String variableName = ctx.ID().getText();
    if (ctx.expr() != null) {
      Value value = (Value) visit(ctx.expr());
      this.globals.define(variableName, value);
    } else {
      this.globals.define(variableName, new Value());
    }
    return 0;
  }

  @Override
  public Object visitVariable_assignment(BaritsuParser.Variable_assignmentContext ctx) {
    String variableName = ctx.ID().getText();
    if (ctx.expr() != null) {
      Value value = (Value) visit(ctx.expr());
      this.globals.update(variableName, value);
    }
    return visitChildren(ctx);
  }
  @Override
  public Integer visitPrintStat(BaritsuParser.PrintStatContext ctx) {
    Value obj = (Value) visit(ctx.expr());
    System.out.print(obj);
    return 0;
  }

  @Override
  public Integer visitPutsStat(BaritsuParser.PutsStatContext ctx) {
    Value obj = (Value) visit(ctx.expr());
    System.out.println(obj);
    return 0;
  }

// Primitive Visitors
  @Override
  public Value visitString(BaritsuParser.StringContext ctx) {
    // System.out.println("ctx.STRING().getText()"+ctx.STRING().getText());
    return new Value("STRING", ctx.STRING().getText());
  }

  @Override
  public Value visitInt(BaritsuParser.IntContext ctx) {
    return new Value("INTEGER", Integer.parseInt(ctx.INT().getText()));
  }

  @Override
  public Value visitBool(BaritsuParser.BoolContext ctx) {
    return new Value("BOOLEAN", Boolean.parseBoolean(ctx.BOOLEAN().getText()));
  }

  @Override
  public Value visitNull(BaritsuParser.NullContext ctx) {
    return new Value("NULL", null);
  }

// Expr Visitors
  @Override
  public Value visitMultiplyExpr(BaritsuParser.MultiplyExprContext ctx) {
    Value lVal = (Value) visit(ctx.expr(0));
    Value rVal =  (Value) visit(ctx.expr(1));
    return Value.multiply(lVal, rVal);
  }

  @Override
  public Value visitDivideExpr(BaritsuParser.DivideExprContext ctx) {
    Value lVal = (Value) visit(ctx.expr(0));
    Value rVal =  (Value) visit(ctx.expr(1));
    return Value.divide(lVal, rVal);
  }

  @Override
  public Value visitSubExpr(BaritsuParser.SubExprContext ctx) {
    Value lVal = (Value) visit(ctx.expr(0));
    Value rVal =  (Value) visit(ctx.expr(1));
    return Value.sub(lVal, rVal);
  }

  @Override
  public Value visitAddExpr(BaritsuParser.AddExprContext ctx) {
    Value lVal = (Value) visit(ctx.expr(0));
    Value rVal =  (Value) visit(ctx.expr(1));
    return Value.add(lVal, rVal);
  }
  @Override
  public Value visitNegateExpr(BaritsuParser.NegateExprContext ctx) {
    Value val = (Value) visit(ctx.expr());
    Value nil = new Value("NULL", null);
    return Value.sub(nil, val);
  }

  @Override
  public Value visitParenExpr(BaritsuParser.ParenExprContext ctx) {
    return (Value) visit(ctx.expr());
  }

  @Override
  public Value visitNotExpr(BaritsuParser.NotExprContext ctx) {
    Value val = (Value) visit(ctx.expr());
    return Value.not(val);
  }

  @Override
  public Value visitIdExpr(BaritsuParser.IdExprContext ctx) {
    String var = ctx.ID().getText();
    return this.globals.get(var) ;
  }

  @Override
  public Value visitGreaterThanEqExpr(BaritsuParser.GreaterThanEqExprContext ctx) {
    Value lVal = (Value) visit(ctx.expr(0));
    Value rVal =  (Value) visit(ctx.expr(1));
    return Value.greaterThanEq(lVal, rVal);
  }

  @Override
  public Value visitLessThanEqExpr(BaritsuParser.LessThanEqExprContext ctx) {
    Value lVal = (Value) visit(ctx.expr(0));
    Value rVal =  (Value) visit(ctx.expr(1));
    return Value.lessThanEq(lVal, rVal);
  }

  @Override
  public Value visitGreaterThanExpr(BaritsuParser.GreaterThanExprContext ctx) {
    Value lVal = (Value) visit(ctx.expr(0));
    Value rVal =  (Value) visit(ctx.expr(1));
    return Value.greaterThan(lVal, rVal);
  }

  @Override
  public Value visitLessThanExpr(BaritsuParser.LessThanExprContext ctx) {
    Value lVal = (Value) visit(ctx.expr(0));
    Value rVal =  (Value) visit(ctx.expr(1));
    return Value.lessThan(lVal, rVal);
  }

  @Override
  public Value visitEqExpr(BaritsuParser.EqExprContext ctx) {
    Value lVal = (Value) visit(ctx.expr(0));
    Value rVal =  (Value) visit(ctx.expr(1));
    return Value.eq(lVal, rVal);
  }

// Loops

  @Override public Value visitBlock(BaritsuParser.BlockContext ctx) {
    return  (Value) visitChildren(ctx);
  }

  @Override public Value visitList_of_statements(BaritsuParser.List_of_statementsContext ctx) {
    return (Value) visitChildren(ctx);
  }

  @Override public Value visitStatement(BaritsuParser.StatementContext ctx) {
    return  (Value) visitChildren(ctx);
  }

  @Override
  public Value visitWhileStat(BaritsuParser.WhileStatContext ctx) {
    Value predicate = (Value) visit(ctx.expr());
    while (Value.isTruthy((Value) visit(ctx.expr()))) {
      for (BaritsuParser.StatementContext stat : ctx.block().list_of_statements().statement()) {
        this.visit(stat);
      }
    }
    return new Value();
  }

  @Override
  public Value visitIfStat(BaritsuParser.IfStatContext ctx) {
    if (Value.isTruthy((Value) visit(ctx.expr(0)))) {
      for (BaritsuParser.StatementContext stat : ctx.block(0).list_of_statements().statement()) {
        this.visit(stat);
      }
    } else {
      if (ctx.expr(1) != null && ctx.block(1) != null) {
        for (BaritsuParser.StatementContext stat : ctx.block(1).list_of_statements().statement()) {
          this.visit(stat);
        }
        if (ctx.block(2) != null) {
          for (BaritsuParser.StatementContext stat : ctx.block(2).list_of_statements().statement()) {
            this.visit(stat);
          }
        } else if (ctx.block(1) != null && ctx.block(2) == null) {
          for (BaritsuParser.StatementContext stat : ctx.block(1).list_of_statements().statement()) {
            this.visit(stat);
          }
        }
      }
    }
      return new Value();
  }
}