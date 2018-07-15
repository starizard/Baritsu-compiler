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
 public Object visitMultiplyExpr(BaritsuParser.MultiplyExprContext ctx) {
    return visitChildren(ctx);
 }

 @Override
   public Object visitSubExpr(BaritsuParser.SubExprContext ctx) {
      return visitChildren(ctx);
  }

  @Override
   public Object visitIdExpr(BaritsuParser.IdExprContext ctx) {
      return visitChildren(ctx);
  }

  @Override
   public Object visitAddExpr(BaritsuParser.AddExprContext ctx) {
      return visitChildren(ctx);
  }

  @Override
   public Object visitNegateExpr(BaritsuParser.NegateExprContext ctx) {
      return visitChildren(ctx);
  }

  @Override
   public Object visitParenExpr(BaritsuParser.ParenExprContext ctx) {
      return visitChildren(ctx);
  }

  @Override
   public Object visitFactorialExpr(BaritsuParser.FactorialExprContext ctx) {
      return visitChildren(ctx);
  }



}