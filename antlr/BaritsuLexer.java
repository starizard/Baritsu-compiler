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
		NEWLINE=25, LETTER=26, INT=27, COMMENT=28, MULTILINECOMMENT=29, SINGLELINECOMMENT=30, 
		WS=31;
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
		"ALPHANUMERICARRAY", "LETTER", "INT", "COMMENT", "MULTILINECOMMENT", "SINGLELINECOMMENT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'('", "')'", "'['", "']'", "'-'", "'!'", "'*'", 
		"'/'", "'+'", "'=='", "','", null, "'null'", null, null, "'print'", "'def'", 
		null, "'do'", "'end'", "';'", "'\n'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "TERMINATOR", "NULL", "STRING", "BOOLEAN", "PRINT", 
		"DEF", "ID", "DO", "END", "SEMICOLON", "NEWLINE", "LETTER", "INT", "COMMENT", 
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			STRING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().substring(1, getText().length()-1));
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\20\6\20d\n\20\r\20\16\20e\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23{\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\7\26\u008a\n\26"+
		"\f\26\16\26\u008d\13\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\6\33\u009c\n\33\r\33\16\33\u009d\3\34\3\34\3\35\6\35"+
		"\u00a3\n\35\r\35\16\35\u00a4\3\36\3\36\5\36\u00a9\n\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\7\37\u00b1\n\37\f\37\16\37\u00b4\13\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \7 \u00bd\n \f \16 \u00c0\13 \3 \3 \3!\6!\u00c5\n!\r!\16!"+
		"\u00c6\3!\3!\4\u00b2\u00be\2\"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\2\67\349\35;\36=\37? A!\3\2\5\3\2\62;\4\2C\\c|\5\2\13\13"+
		"\17\17\"\"\2\u00d5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2"+
		";\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3"+
		"\2\2\2\tI\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17O\3\2\2\2\21Q\3\2\2\2\23S\3"+
		"\2\2\2\25U\3\2\2\2\27W\3\2\2\2\31Y\3\2\2\2\33[\3\2\2\2\35^\3\2\2\2\37"+
		"c\3\2\2\2!g\3\2\2\2#l\3\2\2\2%z\3\2\2\2\'|\3\2\2\2)\u0082\3\2\2\2+\u0086"+
		"\3\2\2\2-\u008e\3\2\2\2/\u0091\3\2\2\2\61\u0095\3\2\2\2\63\u0097\3\2\2"+
		"\2\65\u009b\3\2\2\2\67\u009f\3\2\2\29\u00a2\3\2\2\2;\u00a8\3\2\2\2=\u00ac"+
		"\3\2\2\2?\u00b8\3\2\2\2A\u00c4\3\2\2\2CD\7}\2\2D\4\3\2\2\2EF\7\177\2\2"+
		"F\6\3\2\2\2GH\7?\2\2H\b\3\2\2\2IJ\7*\2\2J\n\3\2\2\2KL\7+\2\2L\f\3\2\2"+
		"\2MN\7]\2\2N\16\3\2\2\2OP\7_\2\2P\20\3\2\2\2QR\7/\2\2R\22\3\2\2\2ST\7"+
		"#\2\2T\24\3\2\2\2UV\7,\2\2V\26\3\2\2\2WX\7\61\2\2X\30\3\2\2\2YZ\7-\2\2"+
		"Z\32\3\2\2\2[\\\7?\2\2\\]\7?\2\2]\34\3\2\2\2^_\7.\2\2_\36\3\2\2\2`d\5"+
		"\61\31\2ad\5\63\32\2bd\5? \2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2de\3\2\2\2e"+
		"c\3\2\2\2ef\3\2\2\2f \3\2\2\2gh\7p\2\2hi\7w\2\2ij\7n\2\2jk\7n\2\2k\"\3"+
		"\2\2\2lm\7$\2\2mn\5\65\33\2no\7$\2\2op\b\22\2\2p$\3\2\2\2qr\7v\2\2rs\7"+
		"t\2\2st\7w\2\2t{\7g\2\2uv\7h\2\2vw\7c\2\2wx\7n\2\2xy\7u\2\2y{\7g\2\2z"+
		"q\3\2\2\2zu\3\2\2\2{&\3\2\2\2|}\7r\2\2}~\7t\2\2~\177\7k\2\2\177\u0080"+
		"\7p\2\2\u0080\u0081\7v\2\2\u0081(\3\2\2\2\u0082\u0083\7f\2\2\u0083\u0084"+
		"\7g\2\2\u0084\u0085\7h\2\2\u0085*\3\2\2\2\u0086\u008b\5\67\34\2\u0087"+
		"\u008a\5\67\34\2\u0088\u008a\t\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088\3"+
		"\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		",\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7f\2\2\u008f\u0090\7q\2\2\u0090"+
		".\3\2\2\2\u0091\u0092\7g\2\2\u0092\u0093\7p\2\2\u0093\u0094\7f\2\2\u0094"+
		"\60\3\2\2\2\u0095\u0096\7=\2\2\u0096\62\3\2\2\2\u0097\u0098\7\f\2\2\u0098"+
		"\64\3\2\2\2\u0099\u009c\5\67\34\2\u009a\u009c\59\35\2\u009b\u0099\3\2"+
		"\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\66\3\2\2\2\u009f\u00a0\t\3\2\2\u00a08\3\2\2\2\u00a1"+
		"\u00a3\t\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5:\3\2\2\2\u00a6\u00a9\5=\37\2\u00a7\u00a9"+
		"\5? \2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ab\b\36\3\2\u00ab<\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad\u00ae\7,\2\2"+
		"\u00ae\u00b2\3\2\2\2\u00af\u00b1\13\2\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6\u00b7\7\61\2\2\u00b7>\3\2\2\2"+
		"\u00b8\u00b9\7\61\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00be\3\2\2\2\u00bb\u00bd"+
		"\13\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bf\3\2\2\2"+
		"\u00be\u00bc\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2"+
		"\5\63\32\2\u00c2@\3\2\2\2\u00c3\u00c5\t\4\2\2\u00c4\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\b!\4\2\u00c9B\3\2\2\2\17\2cez\u0089\u008b\u009b\u009d"+
		"\u00a4\u00a8\u00b2\u00be\u00c6\5\3\22\2\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}