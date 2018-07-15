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
		T__0=1, T__1=2, T__2=3, TERMINATOR=4, STRING=5, BOOLEAN=6, PRINT=7, DEF=8, 
		ID=9, DO=10, END=11, SEMICOLON=12, NEWLINE=13, INT=14, COMMENT=15, WS=16;
	public static final int
		RULE_program = 0, RULE_list_of_expressions = 1, RULE_function_definition = 2, 
		RULE_block = 3, RULE_list_of_statements = 4, RULE_statement = 5, RULE_variable_declaration = 6, 
		RULE_print_statement = 7, RULE_primitive = 8;
	public static final String[] ruleNames = {
		"program", "list_of_expressions", "function_definition", "block", "list_of_statements", 
		"statement", "variable_declaration", "print_statement", "primitive"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", null, null, null, "'print'", "'def'", null, 
		"'do'", "'end'", "';'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "TERMINATOR", "STRING", "BOOLEAN", "PRINT", "DEF", 
		"ID", "DO", "END", "SEMICOLON", "NEWLINE", "INT", "COMMENT", "WS"
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).enterList_of_expressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).exitList_of_expressions(this);
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
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(21);
				function_definition();
				setState(22);
				match(TERMINATOR);
				}
				break;
			case 2:
				{
				setState(24);
				list_of_statements(0);
				}
				break;
			case 3:
				{
				setState(25);
				match(TERMINATOR);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(32);
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
					setState(28);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(29);
					list_of_expressions(3);
					}
					} 
				}
				setState(34);
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
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).enterFunction_definition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).exitFunction_definition(this);
		}
	}

	public final Function_definitionContext function_definition() throws RecognitionException {
		Function_definitionContext _localctx = new Function_definitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_definition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(DEF);
			setState(36);
			match(ID);
			setState(37);
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
		public TerminalNode DO() { return getToken(BaritsuParser.DO, 0); }
		public List_of_statementsContext list_of_statements() {
			return getRuleContext(List_of_statementsContext.class,0);
		}
		public TerminalNode END() { return getToken(BaritsuParser.END, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			setState(47);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DO:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				match(DO);
				setState(40);
				list_of_statements(0);
				setState(41);
				match(END);
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__0);
				setState(44);
				list_of_statements(0);
				setState(45);
				match(T__1);
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

	public static class List_of_statementsContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BaritsuParser.TERMINATOR, 0); }
		public List_of_statementsContext list_of_statements() {
			return getRuleContext(List_of_statementsContext.class,0);
		}
		public List_of_statementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).enterList_of_statements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).exitList_of_statements(this);
		}
	}

	public final List_of_statementsContext list_of_statements() throws RecognitionException {
		return list_of_statements(0);
	}

	private List_of_statementsContext list_of_statements(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_of_statementsContext _localctx = new List_of_statementsContext(_ctx, _parentState);
		List_of_statementsContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_list_of_statements, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(50);
			statement();
			setState(51);
			match(TERMINATOR);
			}
			_ctx.stop = _input.LT(-1);
			setState(59);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_of_statementsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_list_of_statements);
					setState(53);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(54);
					statement();
					setState(55);
					match(TERMINATOR);
					}
					} 
				}
				setState(61);
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
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Variable_declarationContext variable_declaration() {
			return getRuleContext(Variable_declarationContext.class,0);
		}
		public Print_statementContext print_statement() {
			return getRuleContext(Print_statementContext.class,0);
		}
		public PrimitiveContext primitive() {
			return getRuleContext(PrimitiveContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				variable_declaration();
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				print_statement();
				}
				break;
			case STRING:
			case BOOLEAN:
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				primitive();
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
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Variable_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).enterVariable_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).exitVariable_declaration(this);
		}
	}

	public final Variable_declarationContext variable_declaration() throws RecognitionException {
		Variable_declarationContext _localctx = new Variable_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(DEF);
			setState(68);
			match(ID);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(69);
				match(T__2);
				setState(70);
				statement();
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

	public static class Print_statementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(BaritsuParser.PRINT, 0); }
		public TerminalNode ID() { return getToken(BaritsuParser.ID, 0); }
		public Print_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).enterPrint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).exitPrint_statement(this);
		}
	}

	public final Print_statementContext print_statement() throws RecognitionException {
		Print_statementContext _localctx = new Print_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(PRINT);
			setState(74);
			match(ID);
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
		public TerminalNode STRING() { return getToken(BaritsuParser.STRING, 0); }
		public TerminalNode INT() { return getToken(BaritsuParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(BaritsuParser.BOOLEAN, 0); }
		public PrimitiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).enterPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaritsuListener ) ((BaritsuListener)listener).exitPrimitive(this);
		}
	}

	public final PrimitiveContext primitive() throws RecognitionException {
		PrimitiveContext _localctx = new PrimitiveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_primitive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRING) | (1L << BOOLEAN) | (1L << INT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return list_of_expressions_sempred((List_of_expressionsContext)_localctx, predIndex);
		case 4:
			return list_of_statements_sempred((List_of_statementsContext)_localctx, predIndex);
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
	private boolean list_of_statements_sempred(List_of_statementsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22Q\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\3\3\3\7\3!\n\3\f\3\16\3$\13\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\62\n\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\7\6<\n\6\f\6\16\6?\13\6\3\7\3\7\3\7\5\7D\n\7\3\b\3\b"+
		"\3\b\3\b\5\bJ\n\b\3\t\3\t\3\t\3\n\3\n\3\n\2\4\4\n\13\2\4\6\b\n\f\16\20"+
		"\22\2\3\4\2\7\b\20\20\2O\2\24\3\2\2\2\4\34\3\2\2\2\6%\3\2\2\2\b\61\3\2"+
		"\2\2\n\63\3\2\2\2\fC\3\2\2\2\16E\3\2\2\2\20K\3\2\2\2\22N\3\2\2\2\24\25"+
		"\5\4\3\2\25\3\3\2\2\2\26\27\b\3\1\2\27\30\5\6\4\2\30\31\7\6\2\2\31\35"+
		"\3\2\2\2\32\35\5\n\6\2\33\35\7\6\2\2\34\26\3\2\2\2\34\32\3\2\2\2\34\33"+
		"\3\2\2\2\35\"\3\2\2\2\36\37\f\4\2\2\37!\5\4\3\5 \36\3\2\2\2!$\3\2\2\2"+
		"\" \3\2\2\2\"#\3\2\2\2#\5\3\2\2\2$\"\3\2\2\2%&\7\n\2\2&\'\7\13\2\2\'("+
		"\5\b\5\2(\7\3\2\2\2)*\7\f\2\2*+\5\n\6\2+,\7\r\2\2,\62\3\2\2\2-.\7\3\2"+
		"\2./\5\n\6\2/\60\7\4\2\2\60\62\3\2\2\2\61)\3\2\2\2\61-\3\2\2\2\62\t\3"+
		"\2\2\2\63\64\b\6\1\2\64\65\5\f\7\2\65\66\7\6\2\2\66=\3\2\2\2\678\f\3\2"+
		"\289\5\f\7\29:\7\6\2\2:<\3\2\2\2;\67\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2"+
		"\2\2>\13\3\2\2\2?=\3\2\2\2@D\5\16\b\2AD\5\20\t\2BD\5\22\n\2C@\3\2\2\2"+
		"CA\3\2\2\2CB\3\2\2\2D\r\3\2\2\2EF\7\n\2\2FI\7\13\2\2GH\7\5\2\2HJ\5\f\7"+
		"\2IG\3\2\2\2IJ\3\2\2\2J\17\3\2\2\2KL\7\t\2\2LM\7\13\2\2M\21\3\2\2\2NO"+
		"\t\2\2\2O\23\3\2\2\2\b\34\"\61=CI";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}