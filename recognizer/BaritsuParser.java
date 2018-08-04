// Generated from Baritsu.g4 by ANTLR 4.7.1

  package com.shawnrebello.baritsu.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaritsuParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, TERMINATOR=19, NULL=20, WHILE=21, IF=22, ELSE=23, ELSEIF=24, 
		STRING=25, BOOLEAN=26, PRINT=27, PUTS=28, FOR=29, DEF=30, ID=31, DO=32, 
		END=33, SEMICOLON=34, NEWLINE=35, LETTER=36, INT=37, COMMENT=38, MULTILINECOMMENT=39, 
		SINGLELINECOMMENT=40, WS=41;
	public static final int
		RULE_program = 0, RULE_list_of_expressions = 1, RULE_function_definition = 2, 
		RULE_block = 3, RULE_list_of_statements = 4, RULE_statement = 5, RULE_variable_declaration = 6, 
		RULE_variable_assignment = 7, RULE_print_statement = 8, RULE_loop_statement = 9, 
		RULE_branch_statement = 10, RULE_expr = 11, RULE_argList = 12, RULE_primitive = 13;
	public static final String[] ruleNames = {
		"program", "list_of_expressions", "function_definition", "block", "list_of_statements", 
		"statement", "variable_declaration", "variable_assignment", "print_statement", 
		"loop_statement", "branch_statement", "expr", "argList", "primitive"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'('", "')'", "'['", "']'", "'-'", "'!'", "'*'", 
		"'/'", "'+'", "'=='", "'<'", "'>'", "'<='", "'>='", "','", null, "'null'", 
		"'while'", "'if'", "'else'", "'else if'", null, null, "'print'", "'puts'", 
		"'for'", "'def'", null, "'do'", "'end'", "';'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "TERMINATOR", "NULL", "WHILE", 
		"IF", "ELSE", "ELSEIF", "STRING", "BOOLEAN", "PRINT", "PUTS", "FOR", "DEF", 
		"ID", "DO", "END", "SEMICOLON", "NEWLINE", "LETTER", "INT", "COMMENT", 
		"MULTILINECOMMENT", "SINGLELINECOMMENT", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Baritsu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BaritsuParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List_of_expressionsContext list_of_expressions() {
			return getRuleContext(List_of_expressionsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			list_of_expressions(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_of_expressionsContext extends ParserRuleContext {
		public Function_definitionContext function_definition() {
			return getRuleContext(Function_definitionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BaritsuParser.TERMINATOR, 0); }
		public List_of_statementsContext list_of_statements() {
			return getRuleContext(List_of_statementsContext.class,0);
		}
		public List<List_of_expressionsContext> list_of_expressions() {
			return getRuleContexts(List_of_expressionsContext.class);
		}
		public List_of_expressionsContext list_of_expressions(int i) {
			return getRuleContext(List_of_expressionsContext.class,i);
		}
		public List_of_expressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitList_of_expressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_expressionsContext list_of_expressions() throws RecognitionException {
		return list_of_expressions(0);
	}

	private List_of_expressionsContext list_of_expressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_of_expressionsContext _localctx = new List_of_expressionsContext(_ctx, _parentState);
		List_of_expressionsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_list_of_expressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(31);
				function_definition();
				setState(32);
				match(TERMINATOR);
				}
				break;
			case 2:
				{
				setState(34);
				list_of_statements();
				}
				break;
			case 3:
				{
				setState(35);
				match(TERMINATOR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(42);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_of_expressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_list_of_expressions);
					setState(38);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(39);
					list_of_expressions(3);
					}
					} 
				}
				setState(44);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_definitionContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(BaritsuParser.DEF, 0); }
		public TerminalNode ID() { return getToken(BaritsuParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Function_definitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_definition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitFunction_definition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(DEF);
			setState(46);
			match(ID);
			setState(47);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List_of_statementsContext list_of_statements() {
			return getRuleContext(List_of_statementsContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(BaritsuParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(BaritsuParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(BaritsuParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(BaritsuParser.COMMENT, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==COMMENT) {
				{
				{
				setState(49);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==COMMENT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(T__0);
			setState(56);
			list_of_statements();
			setState(57);
			match(T__1);
			setState(61);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					_la = _input.LA(1);
					if ( !(_la==NEWLINE || _la==COMMENT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_of_statementsContext extends ParserRuleContext {
		public List<TerminalNode> TERMINATOR() { return getTokens(BaritsuParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(BaritsuParser.TERMINATOR, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List_of_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_statements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitList_of_statements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_statementsContext list_of_statements() throws RecognitionException {
		List_of_statementsContext _localctx = new List_of_statementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list_of_statements);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TERMINATOR) {
				{
				{
				setState(64);
				match(TERMINATOR);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(70);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(73); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public List<TerminalNode> TERMINATOR() { return getTokens(BaritsuParser.TERMINATOR); }
		public TerminalNode TERMINATOR(int i) {
			return getToken(BaritsuParser.TERMINATOR, i);
		}
		public Variable_assignmentContext variable_assignment() {
			return getRuleContext(Variable_assignmentContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public Loop_statementContext loop_statement() {
			return getRuleContext(Loop_statementContext.class,0);
		}
		public Branch_statementContext branch_statement() {
			return getRuleContext(Branch_statementContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			int _alt;
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				variable_declaration();
				setState(77); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(76);
						match(TERMINATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(79); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				variable_assignment();
				setState(83); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(82);
						match(TERMINATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(85); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case PRINT:
			case PUTS:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				print_statement();
				setState(89); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(88);
						match(TERMINATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(91); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				loop_statement();
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						match(TERMINATOR);
						}
						} 
					}
					setState(99);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				branch_statement();
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(101);
						match(TERMINATOR);
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case NULL:
			case STRING:
			case BOOLEAN:
			case INT:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				primitive();
				setState(109); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(108);
						match(TERMINATOR);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(111); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_declarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(BaritsuParser.DEF, 0); }
		public TerminalNode ID() { return getToken(BaritsuParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitVariable_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(DEF);
			setState(116);
			match(ID);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(117);
				match(T__2);
				setState(118);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Variable_assignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BaritsuParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitVariable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(ID);
			setState(122);
			match(T__2);
			setState(123);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_statementContext extends ParserRuleContext {
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
	 
		public Print_statementContext() { }
		public void copyFrom(Print_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatContext extends Print_statementContext {
		public TerminalNode PRINT() { return getToken(BaritsuParser.PRINT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintStatContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitPrintStat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PutsStatContext extends Print_statementContext {
		public TerminalNode PUTS() { return getToken(BaritsuParser.PUTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PutsStatContext(Print_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitPutsStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_print_statement);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PRINT:
				_localctx = new PrintStatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(PRINT);
				setState(126);
				expr(0);
				}
				break;
			case PUTS:
				_localctx = new PutsStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(PUTS);
				setState(128);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Loop_statementContext extends ParserRuleContext {
		public Loop_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop_statement; }
	 
		public Loop_statementContext() { }
		public void copyFrom(Loop_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileStatContext extends Loop_statementContext {
		public TerminalNode WHILE() { return getToken(BaritsuParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatContext(Loop_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitWhileStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Loop_statementContext loop_statement() throws RecognitionException {
		Loop_statementContext _localctx = new Loop_statementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_loop_statement);
		try {
			_localctx = new WhileStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(WHILE);
			setState(132);
			expr(0);
			setState(133);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Branch_statementContext extends ParserRuleContext {
		public Branch_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch_statement; }
	 
		public Branch_statementContext() { }
		public void copyFrom(Branch_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatContext extends Branch_statementContext {
		public TerminalNode IF() { return getToken(BaritsuParser.IF, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSEIF() { return getToken(BaritsuParser.ELSEIF, 0); }
		public TerminalNode ELSE() { return getToken(BaritsuParser.ELSE, 0); }
		public IfStatContext(Branch_statementContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitIfStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Branch_statementContext branch_statement() throws RecognitionException {
		Branch_statementContext _localctx = new Branch_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_branch_statement);
		int _la;
		try {
			_localctx = new IfStatContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(IF);
			setState(136);
			expr(0);
			setState(137);
			block();
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSEIF) {
				{
				setState(138);
				match(ELSEIF);
				setState(139);
				expr(0);
				}
			}

			setState(142);
			block();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(143);
				match(ELSE);
				}
			}

			setState(146);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LessThanExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitLessThanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LessThanEqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LessThanEqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitLessThanEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(BaritsuParser.ID, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public FunctionCallExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitFunctionCallExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdExprContext extends ExprContext {
		public TerminalNode ID() { return getToken(BaritsuParser.ID, 0); }
		public IdExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitIdExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitGreaterThanExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiplyExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultiplyExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitMultiplyExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GreaterThanEqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GreaterThanEqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitGreaterThanEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SubExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegateExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitNegateExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivideExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DivideExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitDivideExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveExprContext extends ExprContext {
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public PrimitiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitPrimitiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				_localctx = new FunctionCallExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(149);
				match(ID);
				setState(150);
				match(T__3);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__7) | (1L << T__8) | (1L << NULL) | (1L << STRING) | (1L << BOOLEAN) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(151);
					argList();
					}
				}

				setState(154);
				match(T__4);
				}
				break;
			case 2:
				{
				_localctx = new NegateExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(155);
				match(T__7);
				setState(156);
				expr(14);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(T__8);
				setState(158);
				expr(13);
				}
				break;
			case 4:
				{
				_localctx = new IdExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(ID);
				}
				break;
			case 5:
				{
				_localctx = new PrimitiveExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				primitive();
				}
				break;
			case 6:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(161);
				match(T__3);
				setState(162);
				expr(0);
				setState(163);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(201);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(167);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(168);
						match(T__9);
						setState(169);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new DivideExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(170);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(171);
						match(T__10);
						setState(172);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						{
						setState(174);
						match(T__11);
						}
						setState(175);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new SubExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						{
						setState(177);
						match(T__7);
						}
						setState(178);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new EqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(180);
						match(T__12);
						setState(181);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new LessThanExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(183);
						match(T__13);
						setState(184);
						expr(8);
						}
						break;
					case 7:
						{
						_localctx = new GreaterThanExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(186);
						match(T__14);
						setState(187);
						expr(7);
						}
						break;
					case 8:
						{
						_localctx = new LessThanEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(189);
						match(T__15);
						setState(190);
						expr(6);
						}
						break;
					case 9:
						{
						_localctx = new GreaterThanEqExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(191);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(192);
						match(T__16);
						setState(193);
						expr(5);
						}
						break;
					case 10:
						{
						_localctx = new ArrayExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(195);
						match(T__5);
						setState(196);
						expr(0);
						setState(197);
						match(T__6);
						}
						break;
					}
					} 
				}
				setState(203);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitArgList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_argList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			expr(0);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__17) {
				{
				{
				setState(205);
				match(T__17);
				setState(206);
				expr(0);
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveContext extends ParserRuleContext {
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
	 
		public PrimitiveContext() { }
		public void copyFrom(PrimitiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntContext extends PrimitiveContext {
		public TerminalNode INT() { return getToken(BaritsuParser.INT, 0); }
		public IntContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends PrimitiveContext {
		public TerminalNode STRING() { return getToken(BaritsuParser.STRING, 0); }
		public StringContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BoolContext extends PrimitiveContext {
		public TerminalNode BOOLEAN() { return getToken(BaritsuParser.BOOLEAN, 0); }
		public BoolContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullContext extends PrimitiveContext {
		public TerminalNode NULL() { return getToken(BaritsuParser.NULL, 0); }
		public NullContext(PrimitiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaritsuVisitor ) return ((BaritsuVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_primitive);
		try {
			setState(216);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				match(STRING);
				}
				break;
			case INT:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(INT);
				}
				break;
			case BOOLEAN:
				_localctx = new BoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(BOOLEAN);
				}
				break;
			case NULL:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(215);
				match(NULL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return list_of_expressions_sempred((List_of_expressionsContext)_localctx, predIndex);
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean list_of_expressions_sempred(List_of_expressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		case 9:
			return precpred(_ctx, 4);
		case 10:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3\'\n\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\4\3\4\3\4\3\4\3\5\7\5\65"+
		"\n\5\f\5\16\58\13\5\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\6\7\6D\n"+
		"\6\f\6\16\6G\13\6\3\6\6\6J\n\6\r\6\16\6K\3\7\3\7\6\7P\n\7\r\7\16\7Q\3"+
		"\7\3\7\6\7V\n\7\r\7\16\7W\3\7\3\7\6\7\\\n\7\r\7\16\7]\3\7\3\7\7\7b\n\7"+
		"\f\7\16\7e\13\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\7\3\7\6\7p\n\7\r\7\16"+
		"\7q\5\7t\n\7\3\b\3\b\3\b\3\b\5\bz\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\5\n\u0084\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u008f\n\f\3"+
		"\f\3\f\5\f\u0093\n\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u009b\n\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ca\n\r\f\r\16\r\u00cd\13\r\3"+
		"\16\3\16\3\16\7\16\u00d2\n\16\f\16\16\16\u00d5\13\16\3\17\3\17\3\17\3"+
		"\17\5\17\u00db\n\17\3\17\2\4\4\30\20\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\2\3\4\2%%((\2\u00f8\2\36\3\2\2\2\4&\3\2\2\2\6/\3\2\2\2\b\66\3\2\2"+
		"\2\nE\3\2\2\2\fs\3\2\2\2\16u\3\2\2\2\20{\3\2\2\2\22\u0083\3\2\2\2\24\u0085"+
		"\3\2\2\2\26\u0089\3\2\2\2\30\u00a7\3\2\2\2\32\u00ce\3\2\2\2\34\u00da\3"+
		"\2\2\2\36\37\5\4\3\2\37\3\3\2\2\2 !\b\3\1\2!\"\5\6\4\2\"#\7\25\2\2#\'"+
		"\3\2\2\2$\'\5\n\6\2%\'\7\25\2\2& \3\2\2\2&$\3\2\2\2&%\3\2\2\2\',\3\2\2"+
		"\2()\f\4\2\2)+\5\4\3\5*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\5\3\2"+
		"\2\2.,\3\2\2\2/\60\7 \2\2\60\61\7!\2\2\61\62\5\b\5\2\62\7\3\2\2\2\63\65"+
		"\t\2\2\2\64\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2"+
		"\2\28\66\3\2\2\29:\7\3\2\2:;\5\n\6\2;?\7\4\2\2<>\t\2\2\2=<\3\2\2\2>A\3"+
		"\2\2\2?=\3\2\2\2?@\3\2\2\2@\t\3\2\2\2A?\3\2\2\2BD\7\25\2\2CB\3\2\2\2D"+
		"G\3\2\2\2EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2HJ\5\f\7\2IH\3\2\2\2"+
		"JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\13\3\2\2\2MO\5\16\b\2NP\7\25\2\2ON\3\2"+
		"\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2Rt\3\2\2\2SU\5\20\t\2TV\7\25\2\2UT\3"+
		"\2\2\2VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2Xt\3\2\2\2Y[\5\22\n\2Z\\\7\25\2\2"+
		"[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^t\3\2\2\2_c\5\24\13\2`b\7\25"+
		"\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2dt\3\2\2\2ec\3\2\2\2fj\5\26"+
		"\f\2gi\7\25\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2kt\3\2\2\2lj\3"+
		"\2\2\2mo\5\34\17\2np\7\25\2\2on\3\2\2\2pq\3\2\2\2qo\3\2\2\2qr\3\2\2\2"+
		"rt\3\2\2\2sM\3\2\2\2sS\3\2\2\2sY\3\2\2\2s_\3\2\2\2sf\3\2\2\2sm\3\2\2\2"+
		"t\r\3\2\2\2uv\7 \2\2vy\7!\2\2wx\7\5\2\2xz\5\30\r\2yw\3\2\2\2yz\3\2\2\2"+
		"z\17\3\2\2\2{|\7!\2\2|}\7\5\2\2}~\5\30\r\2~\21\3\2\2\2\177\u0080\7\35"+
		"\2\2\u0080\u0084\5\30\r\2\u0081\u0082\7\36\2\2\u0082\u0084\5\30\r\2\u0083"+
		"\177\3\2\2\2\u0083\u0081\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\7\27\2\2"+
		"\u0086\u0087\5\30\r\2\u0087\u0088\5\b\5\2\u0088\25\3\2\2\2\u0089\u008a"+
		"\7\30\2\2\u008a\u008b\5\30\r\2\u008b\u008e\5\b\5\2\u008c\u008d\7\32\2"+
		"\2\u008d\u008f\5\30\r\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\5\b\5\2\u0091\u0093\7\31\2\2\u0092\u0091\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0095\5\b\5\2\u0095"+
		"\27\3\2\2\2\u0096\u0097\b\r\1\2\u0097\u0098\7!\2\2\u0098\u009a\7\6\2\2"+
		"\u0099\u009b\5\32\16\2\u009a\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u00a8\7\7\2\2\u009d\u009e\7\n\2\2\u009e\u00a8\5\30\r\20"+
		"\u009f\u00a0\7\13\2\2\u00a0\u00a8\5\30\r\17\u00a1\u00a8\7!\2\2\u00a2\u00a8"+
		"\5\34\17\2\u00a3\u00a4\7\6\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\7\7\2"+
		"\2\u00a6\u00a8\3\2\2\2\u00a7\u0096\3\2\2\2\u00a7\u009d\3\2\2\2\u00a7\u009f"+
		"\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a2\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a8"+
		"\u00cb\3\2\2\2\u00a9\u00aa\f\16\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ca\5"+
		"\30\r\17\u00ac\u00ad\f\r\2\2\u00ad\u00ae\7\r\2\2\u00ae\u00ca\5\30\r\16"+
		"\u00af\u00b0\f\f\2\2\u00b0\u00b1\7\16\2\2\u00b1\u00ca\5\30\r\r\u00b2\u00b3"+
		"\f\13\2\2\u00b3\u00b4\7\n\2\2\u00b4\u00ca\5\30\r\f\u00b5\u00b6\f\n\2\2"+
		"\u00b6\u00b7\7\17\2\2\u00b7\u00ca\5\30\r\13\u00b8\u00b9\f\t\2\2\u00b9"+
		"\u00ba\7\20\2\2\u00ba\u00ca\5\30\r\n\u00bb\u00bc\f\b\2\2\u00bc\u00bd\7"+
		"\21\2\2\u00bd\u00ca\5\30\r\t\u00be\u00bf\f\7\2\2\u00bf\u00c0\7\22\2\2"+
		"\u00c0\u00ca\5\30\r\b\u00c1\u00c2\f\6\2\2\u00c2\u00c3\7\23\2\2\u00c3\u00ca"+
		"\5\30\r\7\u00c4\u00c5\f\21\2\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7\5\30\r"+
		"\2\u00c7\u00c8\7\t\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00a9\3\2\2\2\u00c9\u00ac"+
		"\3\2\2\2\u00c9\u00af\3\2\2\2\u00c9\u00b2\3\2\2\2\u00c9\u00b5\3\2\2\2\u00c9"+
		"\u00b8\3\2\2\2\u00c9\u00bb\3\2\2\2\u00c9\u00be\3\2\2\2\u00c9\u00c1\3\2"+
		"\2\2\u00c9\u00c4\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\31\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d3\5\30\r"+
		"\2\u00cf\u00d0\7\24\2\2\u00d0\u00d2\5\30\r\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\33\3\2\2"+
		"\2\u00d5\u00d3\3\2\2\2\u00d6\u00db\7\33\2\2\u00d7\u00db\7\'\2\2\u00d8"+
		"\u00db\7\34\2\2\u00d9\u00db\7\26\2\2\u00da\u00d6\3\2\2\2\u00da\u00d7\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db\35\3\2\2\2\31&,\66"+
		"?EKQW]cjqsy\u0083\u008e\u0092\u009a\u00a7\u00c9\u00cb\u00d3\u00da";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}