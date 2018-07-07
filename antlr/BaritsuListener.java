// Generated from Baritsu.g4 by ANTLR 4.7.1

  package com.shawnrebello.baritsu.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BaritsuParser}.
 */
public interface BaritsuListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BaritsuParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(BaritsuParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaritsuParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(BaritsuParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaritsuParser#list_of_expressions}.
	 * @param ctx the parse tree
	 */
	void enterList_of_expressions(BaritsuParser.List_of_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaritsuParser#list_of_expressions}.
	 * @param ctx the parse tree
	 */
	void exitList_of_expressions(BaritsuParser.List_of_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaritsuParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void enterFunction_definition(BaritsuParser.Function_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaritsuParser#function_definition}.
	 * @param ctx the parse tree
	 */
	void exitFunction_definition(BaritsuParser.Function_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaritsuParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(BaritsuParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaritsuParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(BaritsuParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaritsuParser#list_of_statements}.
	 * @param ctx the parse tree
	 */
	void enterList_of_statements(BaritsuParser.List_of_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaritsuParser#list_of_statements}.
	 * @param ctx the parse tree
	 */
	void exitList_of_statements(BaritsuParser.List_of_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaritsuParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(BaritsuParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaritsuParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(BaritsuParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaritsuParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaration(BaritsuParser.Variable_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaritsuParser#variable_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaration(BaritsuParser.Variable_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaritsuParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(BaritsuParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaritsuParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(BaritsuParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaritsuParser#primitive}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive(BaritsuParser.PrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaritsuParser#primitive}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive(BaritsuParser.PrimitiveContext ctx);
}