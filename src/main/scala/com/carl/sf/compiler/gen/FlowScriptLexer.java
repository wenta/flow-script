// Generated from /home/klangner/workspaces/scala/flow-script/src/main/scala/com/carl/sf/compiler/FlowScript.g4 by ANTLR 4.7
package com.carl.sf.compiler.gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FlowScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, DEF=6, EXTERNAL=7, MODULE=8, WS=9, 
		LINE_COMMENT=10, Identifier=11, QUOTED_STRING=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "DEF", "EXTERNAL", "MODULE", "WS", 
		"LINE_COMMENT", "Identifier", "QUOTED_STRING", "Letter", "LetterOrDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "':'", "'='", "','", "'def'", "'external'", "'module'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "DEF", "EXTERNAL", "MODULE", "WS", 
		"LINE_COMMENT", "Identifier", "QUOTED_STRING"
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


	public FlowScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "FlowScript.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\16n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\6\n?\n\n\r\n\16\n@\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\7\13I\n\13\f\13\16\13L\13\13\3\13\3\13\3\f\3\f\7\fR\n\f\f\f\16\fU\13"+
		"\f\3\r\3\r\7\rY\n\r\f\r\16\r\\\13\r\3\r\3\r\3\r\3\r\3\r\7\rc\n\r\f\r\16"+
		"\rf\13\r\3\r\5\ri\n\r\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\2\35\2\3\2\6\5\2\13\f\16\17\""+
		"\"\4\2\f\f\17\17\6\2&&C\\aac|\7\2&&\62;C\\aac|\2r\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\37\3\2"+
		"\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13\'\3\2\2\2\r)\3\2\2\2\17-\3\2"+
		"\2\2\21\66\3\2\2\2\23>\3\2\2\2\25D\3\2\2\2\27O\3\2\2\2\31h\3\2\2\2\33"+
		"j\3\2\2\2\35l\3\2\2\2\37 \7*\2\2 \4\3\2\2\2!\"\7+\2\2\"\6\3\2\2\2#$\7"+
		"<\2\2$\b\3\2\2\2%&\7?\2\2&\n\3\2\2\2\'(\7.\2\2(\f\3\2\2\2)*\7f\2\2*+\7"+
		"g\2\2+,\7h\2\2,\16\3\2\2\2-.\7g\2\2./\7z\2\2/\60\7v\2\2\60\61\7g\2\2\61"+
		"\62\7t\2\2\62\63\7p\2\2\63\64\7c\2\2\64\65\7n\2\2\65\20\3\2\2\2\66\67"+
		"\7o\2\2\678\7q\2\289\7f\2\29:\7w\2\2:;\7n\2\2;<\7g\2\2<\22\3\2\2\2=?\t"+
		"\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\b\n\2\2C\24"+
		"\3\2\2\2DE\7\61\2\2EF\7\61\2\2FJ\3\2\2\2GI\n\3\2\2HG\3\2\2\2IL\3\2\2\2"+
		"JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\b\13\2\2N\26\3\2\2\2OS\5\33"+
		"\16\2PR\5\35\17\2QP\3\2\2\2RU\3\2\2\2SQ\3\2\2\2ST\3\2\2\2T\30\3\2\2\2"+
		"US\3\2\2\2VZ\7)\2\2WY\n\3\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[]\3\2\2\2\\Z\3\2\2\2]i\7)\2\2^d\7$\2\2_`\7^\2\2`c\7$\2\2ac\n\3\2\2b_"+
		"\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2g"+
		"i\7$\2\2hV\3\2\2\2h^\3\2\2\2i\32\3\2\2\2jk\t\4\2\2k\34\3\2\2\2lm\t\5\2"+
		"\2m\36\3\2\2\2\n\2@JSZbdh\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}