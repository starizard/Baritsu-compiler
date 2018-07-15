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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, TERMINATOR=15, NULL=16, 
		STRING=17, BOOLEAN=18, PRINT=19, DEF=20, ID=21, DO=22, END=23, SEMICOLON=24, 
		NEWLINE=25, INT=26, COMMENT=27, MULTILINECOMMENT=28, SINGLELINECOMMENT=29, 
		WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "TERMINATOR", "NULL", "STRING", 
		"BOOLEAN", "PRINT", "DEF", "ID", "DO", "END", "SEMICOLON", "NEWLINE", 
		"LETTER", "INT", "COMMENT", "MULTILINECOMMENT", "SINGLELINECOMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'('", "')'", "'['", "']'", "'-'", "'!'", "'*'", 
		"'/'", "'+'", "'=='", "','", null, "'null'", null, null, "'print'", "'def'", 
		null, "'do'", "'end'", "';'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "TERMINATOR", "NULL", "STRING", "BOOLEAN", "PRINT", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00c6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\6\20"+
		"b\n\20\r\20\16\20c\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\6\22n\n\22"+
		"\r\22\16\22o\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5"+
		"\23}\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\7\26\u008c\n\26\f\26\16\26\u008f\13\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\6\34\u009f\n\34\r\34\16"+
		"\34\u00a0\3\35\3\35\5\35\u00a5\n\35\3\35\3\35\3\36\3\36\3\36\3\36\7\36"+
		"\u00ad\n\36\f\36\16\36\u00b0\13\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\7\37\u00b9\n\37\f\37\16\37\u00bc\13\37\3\37\3\37\3 \6 \u00c1\n \r \16"+
		" \u00c2\3 \3 \4\u00ae\u00ba\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\2\67\349\35;\36=\37? \3\2\5\3\2\62;\4\2C\\c|\5\2\13\13\17"+
		"\17\"\"\2\u00d1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2"+
		"\2\13I\3\2\2\2\rK\3\2\2\2\17M\3\2\2\2\21O\3\2\2\2\23Q\3\2\2\2\25S\3\2"+
		"\2\2\27U\3\2\2\2\31W\3\2\2\2\33Y\3\2\2\2\35\\\3\2\2\2\37a\3\2\2\2!e\3"+
		"\2\2\2#j\3\2\2\2%|\3\2\2\2\'~\3\2\2\2)\u0084\3\2\2\2+\u0088\3\2\2\2-\u0090"+
		"\3\2\2\2/\u0093\3\2\2\2\61\u0097\3\2\2\2\63\u0099\3\2\2\2\65\u009b\3\2"+
		"\2\2\67\u009e\3\2\2\29\u00a4\3\2\2\2;\u00a8\3\2\2\2=\u00b4\3\2\2\2?\u00c0"+
		"\3\2\2\2AB\7}\2\2B\4\3\2\2\2CD\7\177\2\2D\6\3\2\2\2EF\7?\2\2F\b\3\2\2"+
		"\2GH\7*\2\2H\n\3\2\2\2IJ\7+\2\2J\f\3\2\2\2KL\7]\2\2L\16\3\2\2\2MN\7_\2"+
		"\2N\20\3\2\2\2OP\7/\2\2P\22\3\2\2\2QR\7#\2\2R\24\3\2\2\2ST\7,\2\2T\26"+
		"\3\2\2\2UV\7\61\2\2V\30\3\2\2\2WX\7-\2\2X\32\3\2\2\2YZ\7?\2\2Z[\7?\2\2"+
		"[\34\3\2\2\2\\]\7.\2\2]\36\3\2\2\2^b\5\61\31\2_b\5\63\32\2`b\5=\37\2a"+
		"^\3\2\2\2a_\3\2\2\2a`\3\2\2\2bc\3\2\2\2ca\3\2\2\2cd\3\2\2\2d \3\2\2\2"+
		"ef\7p\2\2fg\7w\2\2gh\7n\2\2hi\7n\2\2i\"\3\2\2\2jm\7$\2\2kn\5\65\33\2l"+
		"n\5\67\34\2mk\3\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2"+
		"\2qr\7$\2\2r$\3\2\2\2st\7v\2\2tu\7t\2\2uv\7w\2\2v}\7g\2\2wx\7h\2\2xy\7"+
		"c\2\2yz\7n\2\2z{\7u\2\2{}\7g\2\2|s\3\2\2\2|w\3\2\2\2}&\3\2\2\2~\177\7"+
		"r\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0083"+
		"\7v\2\2\u0083(\3\2\2\2\u0084\u0085\7f\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7h\2\2\u0087*\3\2\2\2\u0088\u008d\5\65\33\2\u0089\u008c\5\65\33\2\u008a"+
		"\u008c\t\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2"+
		"\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e,\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0091\7f\2\2\u0091\u0092\7q\2\2\u0092.\3\2\2\2\u0093\u0094"+
		"\7g\2\2\u0094\u0095\7p\2\2\u0095\u0096\7f\2\2\u0096\60\3\2\2\2\u0097\u0098"+
		"\7=\2\2\u0098\62\3\2\2\2\u0099\u009a\7\f\2\2\u009a\64\3\2\2\2\u009b\u009c"+
		"\t\3\2\2\u009c\66\3\2\2\2\u009d\u009f\t\2\2\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a18\3\2\2\2"+
		"\u00a2\u00a5\5;\36\2\u00a3\u00a5\5=\37\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3"+
		"\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\35\2\2\u00a7:\3\2\2\2\u00a8"+
		"\u00a9\7\61\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ae\3\2\2\2\u00ab\u00ad\13"+
		"\2\2\2\u00ac\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b2\7,"+
		"\2\2\u00b2\u00b3\7\61\2\2\u00b3<\3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5\u00b6"+
		"\7\61\2\2\u00b6\u00ba\3\2\2\2\u00b7\u00b9\13\2\2\2\u00b8\u00b7\3\2\2\2"+
		"\u00b9\u00bc\3\2\2\2\u00ba\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd"+
		"\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5\63\32\2\u00be>\3\2\2\2\u00bf"+
		"\u00c1\t\4\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\b \3\2\u00c5"+
		"@\3\2\2\2\17\2acmo|\u008b\u008d\u00a0\u00a4\u00ae\u00ba\u00c2\4\2\3\2"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}