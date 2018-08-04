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
	 * Visit a parse tree produced by {@link BaritsuParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(BaritsuParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStat}
	 * labeled alternative in {@link BaritsuParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStat(BaritsuParser.PrintStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code putsStat}
	 * labeled alternative in {@link BaritsuParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPutsStat(BaritsuParser.PutsStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link BaritsuParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(BaritsuParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link BaritsuParser#branch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(BaritsuParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanExpr(BaritsuParser.LessThanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lessThanEqExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThanEqExpr(BaritsuParser.LessThanEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpr(BaritsuParser.FunctionCallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(BaritsuParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(BaritsuParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpr(BaritsuParser.GreaterThanExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpr(BaritsuParser.MultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanEqExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanEqExpr(BaritsuParser.GreaterThanEqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(BaritsuParser.SubExprContext ctx);
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
	 * Visit a parse tree produced by the {@code primitiveExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveExpr(BaritsuParser.PrimitiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpr(BaritsuParser.DivideExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(BaritsuParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link BaritsuParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(BaritsuParser.NotExprContext ctx);
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