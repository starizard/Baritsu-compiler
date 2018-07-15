package com.shawnrebello.baritsu.lib;

import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import com.shawnrebello.baritsu.antlr.*;
import java.lang.reflect.Method;


public class EvalVisitor extends BaritsuBaseVisitor {
 Map < String, Value > variables = new HashMap < String, Value > ();
 @Override
 public Object visitVariable_declaration(BaritsuParser.Variable_declarationContext ctx) {
    String variableName = ctx.ID().getText();
    if (ctx.expr() != null) {
     Value value = (Value) visit(ctx.expr());

    Value boolValue = new Value(value.type, value);
    variables.put(variableName, boolValue);
     System.out.println(variableName + " = " + value.value);
    }
    return 0;
 }

 @Override
 public Integer visitPrint_statement(BaritsuParser.Print_statementContext ctx) {
    Value obj = (Value) visit(ctx.expr());
    System.out.println(obj); // Coerce to String
    return 0;
  }


// Primitive Visitors

 @Override
 public Value visitString(BaritsuParser.StringContext ctx) {
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
       if(variables.containsKey(var)){
         Value value = variables.get(var);
         System.out.println(var + " = " + value.value + " :: " + value.type);
         return value;
       }
       else {
         Value undefinedValue = new Value("UNDEFINED", null);
         return undefinedValue;
       }
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

  }