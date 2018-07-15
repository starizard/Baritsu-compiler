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
		T__0=1, T__1=2, T__2=3, TERMINATOR=4, STRING=5, BOOLEAN=6, PRINT=7, DEF=8, 
		ID=9, DO=10, END=11, SEMICOLON=12, NEWLINE=13, INT=14, COMMENT=15, WS=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "TERMINATOR", "STRING", "BOOLEAN", "PRINT", "DEF", 
		"ID", "DO", "END", "SEMICOLON", "NEWLINE", "LETTER", "INT", "COMMENT", 
		"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\6\5.\n\5\r\5\16\5/\3\6\3\6\3\6\6"+
		"\6\65\n\6\r\6\16\6\66\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"D\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\nS\n\n\f\n"+
		"\16\nV\13\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\6\20f\n\20\r\20\16\20g\3\21\3\21\3\21\3\21\7\21n\n\21\f\21\16\21"+
		"q\13\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21y\n\21\f\21\16\21|\13\21\3\21"+
		"\5\21\177\n\21\3\21\3\21\3\22\6\22\u0084\n\22\r\22\16\22\u0085\3\22\3"+
		"\22\4oz\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\2\37\20!\21#\22\3\2\5\3\2\62;\4\2C\\c|\5\2\13\13\17\17\"\"\2"+
		"\u0093\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3"+
		"%\3\2\2\2\5\'\3\2\2\2\7)\3\2\2\2\t-\3\2\2\2\13\61\3\2\2\2\rC\3\2\2\2\17"+
		"E\3\2\2\2\21K\3\2\2\2\23O\3\2\2\2\25W\3\2\2\2\27Z\3\2\2\2\31^\3\2\2\2"+
		"\33`\3\2\2\2\35b\3\2\2\2\37e\3\2\2\2!~\3\2\2\2#\u0083\3\2\2\2%&\7}\2\2"+
		"&\4\3\2\2\2\'(\7\177\2\2(\6\3\2\2\2)*\7?\2\2*\b\3\2\2\2+.\5\31\r\2,.\5"+
		"\33\16\2-+\3\2\2\2-,\3\2\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\n\3\2"+
		"\2\2\61\64\7$\2\2\62\65\5\35\17\2\63\65\5\37\20\2\64\62\3\2\2\2\64\63"+
		"\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\289\7$\2"+
		"\29\f\3\2\2\2:;\7v\2\2;<\7t\2\2<=\7w\2\2=D\7g\2\2>?\7h\2\2?@\7c\2\2@A"+
		"\7n\2\2AB\7u\2\2BD\7g\2\2C:\3\2\2\2C>\3\2\2\2D\16\3\2\2\2EF\7r\2\2FG\7"+
		"t\2\2GH\7k\2\2HI\7p\2\2IJ\7v\2\2J\20\3\2\2\2KL\7f\2\2LM\7g\2\2MN\7h\2"+
		"\2N\22\3\2\2\2OT\5\35\17\2PS\5\35\17\2QS\t\2\2\2RP\3\2\2\2RQ\3\2\2\2S"+
		"V\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\24\3\2\2\2VT\3\2\2\2WX\7f\2\2XY\7q\2\2"+
		"Y\26\3\2\2\2Z[\7g\2\2[\\\7p\2\2\\]\7f\2\2]\30\3\2\2\2^_\7=\2\2_\32\3\2"+
		"\2\2`a\7\f\2\2a\34\3\2\2\2bc\t\3\2\2c\36\3\2\2\2df\t\2\2\2ed\3\2\2\2f"+
		"g\3\2\2\2ge\3\2\2\2gh\3\2\2\2h \3\2\2\2ij\7\61\2\2jk\7,\2\2ko\3\2\2\2"+
		"ln\13\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo\3\2\2"+
		"\2rs\7,\2\2s\177\7\61\2\2tu\7\61\2\2uv\7\61\2\2vz\3\2\2\2wy\13\2\2\2x"+
		"w\3\2\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2\2\2{}\3\2\2\2|z\3\2\2\2}\177\5\33"+
		"\16\2~i\3\2\2\2~t\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\b\21\2\2\u0081"+
		"\"\3\2\2\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088"+
		"\b\22\3\2\u0088$\3\2\2\2\17\2-/\64\66CRTgoz~\u0085\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}