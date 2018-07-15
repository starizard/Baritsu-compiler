// Generated from Baritsu.g4 by ANTLR 4.7.1

  package com.shawnrebello.baritsu.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BaritsuParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BaritsuVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BaritsuParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BaritsuParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaritsuParser#list_of_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_expressions(BaritsuParser.List_of_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaritsuParser#function_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_definition(BaritsuParser.Function_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaritsuParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BaritsuParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaritsuParser#list_of_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_statements(BaritsuParser.List_of_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaritsuParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(BaritsuParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaritsuParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaration(BaritsuParser.Variable_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaritsuParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(BaritsuParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(BaritsuParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpr(BaritsuParser.MultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(BaritsuParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(BaritsuParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(BaritsuParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negateExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegateExpr(BaritsuParser.NegateExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(BaritsuParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorialExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorialExpr(BaritsuParser.FactorialExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpr(BaritsuParser.PrimitiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(BaritsuParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(BaritsuParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaritsuParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(BaritsuParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link BaritsuParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(BaritsuParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link BaritsuParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(BaritsuParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link BaritsuParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(BaritsuParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code null}
	 * labeled alternative in {@link BaritsuParser#primitive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull(BaritsuParser.NullContext ctx);
}