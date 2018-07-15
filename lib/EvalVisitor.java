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
    Object x = visitChildren(ctx);
    if (ctx.expr() != null) {
     String value = ctx.expr().getText();
     // GET ALL METHODS
    //  Class tClass = ctx.expr().getClass();
    //  Method[] methods = tClass.getDeclaredMethods();
    //  for (int i = 0; i < methods.length; i++) {
		// 	System.out.println("method: " + methods[i]);
		// }
     System.out.println(variableName + " = " + x);
    }
    return x;
 }

 @Override
 public Integer visitPrint_statement(BaritsuParser.Print_statementContext ctx) {
    Object obj = visit(ctx.expr());
    System.out.println("" + obj); // Coerce to String
    return 0;
  }


// Primitive Visitors

 @Override
 public String visitString(BaritsuParser.StringContext ctx) {
   return String.valueOf(ctx.STRING().getText());
  }

 @Override
 public Integer visitInt(BaritsuParser.IntContext ctx) {
    return Integer.valueOf(ctx.INT().getText());
  }

 @Override
 public Boolean visitBool(BaritsuParser.BoolContext ctx) {
    return Boolean.valueOf(ctx.BOOLEAN().getText());
  }

 @Override
 public Object visitNull(BaritsuParser.NullContext ctx) {
    return null;
  }

// Expr Visitors
@Override
 public Integer visitMultiplyExpr(BaritsuParser.MultiplyExprContext ctx) {
    Object l = visit(ctx.expr(0));
    Object r = visit(ctx.expr(1));
    if (l instanceof Integer && r instanceof Integer) {
      Integer left = (Integer) l;
      Integer right = (Integer)r;
      return left * right;
    }
    return -1; // TODO: THROW AN ERROR HERE
 }

 @Override
 public Integer visitDivideExpr(BaritsuParser.DivideExprContext ctx) {
  Object l = visit(ctx.expr(0));
  Object r = visit(ctx.expr(1));
  if (l instanceof Integer && r instanceof Integer) {
    Integer left = (Integer) l;
    Integer right = (Integer) r;
    return left / right;
  }
  return -1; // TODO: THROW AN ERROR HERE
 }

 @Override
   public Integer visitSubExpr(BaritsuParser.SubExprContext ctx) {
    Object l = visit(ctx.expr(0));
    Object r = visit(ctx.expr(1));
    if (l instanceof Integer && r instanceof Integer) {
      Integer left = (Integer) l;
      Integer right = (Integer) r;
      return left - right;
    }
    return -1; // TODO: THROW AN ERROR HERE
  }

  @Override
   public Object visitIdExpr(BaritsuParser.IdExprContext ctx) {
      return visitChildren(ctx);
  }

  @Override
   public Integer visitAddExpr(BaritsuParser.AddExprContext ctx) {
    Object l = visit(ctx.expr(0));
    Object r = visit(ctx.expr(1));
    if (l instanceof Integer && r instanceof Integer) {
      Integer left = (Integer) l;
      Integer right = (Integer) r;
      return left + right;
    }
    return -1; // TODO: THROW AN ERROR HERE
  }
  @Override
   public Integer visitNegateExpr(BaritsuParser.NegateExprContext ctx) {
      Object expr = visit(ctx.expr());
      if (expr instanceof Integer) {
        int e = (Integer) expr;
        return -e;
      }
     return -1; // TODO: THROW AN ERROR HERE
  }

  @Override
   public Object visitParenExpr(BaritsuParser.ParenExprContext ctx) {
    return visit(ctx.expr());
  }

  @Override
   public Boolean visitNotExpr(BaritsuParser.NotExprContext ctx) {
    Object expr = visit(ctx.expr());
    if (expr instanceof Boolean) {
      Boolean e = (Boolean) expr;
      return !e;
    }
   return false; // TODO: THROW AN ERROR HERE
  }



}