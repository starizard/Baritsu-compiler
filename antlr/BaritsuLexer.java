// Generated from Baritsu.g4 by ANTLR 4.7.1

  package com.shawnrebello.baritsu.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BaritsuLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, TERMINATOR=4, NULL=5, STRING=6, BOOLEAN=7, PRINT=8, 
		DEF=9, ID=10, DO=11, END=12, SEMICOLON=13, NEWLINE=14, INT=15, COMMENT=16, 
		MULTILINECOMMENT=17, SINGLELINECOMMENT=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "TERMINATOR", "NULL", "STRING", "BOOLEAN", "PRINT", 
		"DEF", "ID", "DO", "END", "SEMICOLON", "NEWLINE", "LETTER", "INT", "COMMENT", 
		"MULTILINECOMMENT", "SINGLELINECOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", null, "'null'", null, null, "'print'", "'def'", 
		null, "'do'", "'end'", "';'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "TERMINATOR", "NULL", "STRING", "BOOLEAN", "PRINT", 
		"DEF", "ID", "DO", "END", "SEMICOLON", "NEWLINE", "INT", "COMMENT", "MULTILINECOMMENT", 
		"SINGLELINECOMMENT", "WS"
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


	public BaritsuLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Baritsu.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\6\5\65\n\5\r\5\16\5\66\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\6\7A\n\7\r\7"+
		"\16\7B\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bP\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13_\n\13\f\13\16\13b\13"+
		"\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\6\21"+
		"r\n\21\r\21\16\21s\3\22\3\22\5\22x\n\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\7\23\u0080\n\23\f\23\16\23\u0083\13\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\7\24\u008c\n\24\f\24\16\24\u008f\13\24\3\24\3\24\3\25\6\25\u0094"+
		"\n\25\r\25\16\25\u0095\3\25\3\25\4\u0081\u008d\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\21#\22%\23\'"+
		"\24)\25\3\2\5\3\2\62;\4\2C\\c|\5\2\13\13\17\17\"\"\2\u00a4\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\3+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\64\3\2\2\2\138\3\2\2"+
		"\2\r=\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23W\3\2\2\2\25[\3\2\2\2\27c\3\2"+
		"\2\2\31f\3\2\2\2\33j\3\2\2\2\35l\3\2\2\2\37n\3\2\2\2!q\3\2\2\2#w\3\2\2"+
		"\2%{\3\2\2\2\'\u0087\3\2\2\2)\u0093\3\2\2\2+,\7}\2\2,\4\3\2\2\2-.\7\177"+
		"\2\2.\6\3\2\2\2/\60\7?\2\2\60\b\3\2\2\2\61\65\5\33\16\2\62\65\5\35\17"+
		"\2\63\65\5\'\24\2\64\61\3\2\2\2\64\62\3\2\2\2\64\63\3\2\2\2\65\66\3\2"+
		"\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\n\3\2\2\289\7p\2\29:\7w\2\2:;\7n\2"+
		"\2;<\7n\2\2<\f\3\2\2\2=@\7$\2\2>A\5\37\20\2?A\5!\21\2@>\3\2\2\2@?\3\2"+
		"\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7$\2\2E\16\3\2\2\2FG\7"+
		"v\2\2GH\7t\2\2HI\7w\2\2IP\7g\2\2JK\7h\2\2KL\7c\2\2LM\7n\2\2MN\7u\2\2N"+
		"P\7g\2\2OF\3\2\2\2OJ\3\2\2\2P\20\3\2\2\2QR\7r\2\2RS\7t\2\2ST\7k\2\2TU"+
		"\7p\2\2UV\7v\2\2V\22\3\2\2\2WX\7f\2\2XY\7g\2\2YZ\7h\2\2Z\24\3\2\2\2[`"+
		"\5\37\20\2\\_\5\37\20\2]_\t\2\2\2^\\\3\2\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2"+
		"\2\2`a\3\2\2\2a\26\3\2\2\2b`\3\2\2\2cd\7f\2\2de\7q\2\2e\30\3\2\2\2fg\7"+
		"g\2\2gh\7p\2\2hi\7f\2\2i\32\3\2\2\2jk\7=\2\2k\34\3\2\2\2lm\7\f\2\2m\36"+
		"\3\2\2\2no\t\3\2\2o \3\2\2\2pr\t\2\2\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2s"+
		"t\3\2\2\2t\"\3\2\2\2ux\5%\23\2vx\5\'\24\2wu\3\2\2\2wv\3\2\2\2xy\3\2\2"+
		"\2yz\b\22\2\2z$\3\2\2\2{|\7\61\2\2|}\7,\2\2}\u0081\3\2\2\2~\u0080\13\2"+
		"\2\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\u0082\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0082\u0084\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7,\2\2\u0085"+
		"\u0086\7\61\2\2\u0086&\3\2\2\2\u0087\u0088\7\61\2\2\u0088\u0089\7\61\2"+
		"\2\u0089\u008d\3\2\2\2\u008a\u008c\13\2\2\2\u008b\u008a\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u0090\3\2"+
		"\2\2\u008f\u008d\3\2\2\2\u0090\u0091\5\35\17\2\u0091(\3\2\2\2\u0092\u0094"+
		"\t\4\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\b\25\3\2\u0098*\3\2\2\2"+
		"\17\2\64\66@BO^`sw\u0081\u008d\u0095\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}