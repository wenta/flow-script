// Generated from /home/klangner/workspaces/scala/tsengine/src/main/scala/com/carl/tsengine/compiler/FlowScript.g4 by ANTLR 4.7
package com.carl.tsengine.compiler.gen;
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
		T__0=1, T__1=2, T__2=3, T__3=4, DEF=5, MODULE=6, WS=7, LINE_COMMENT=8, 
		Identifier=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "DEF", "MODULE", "WS", "LINE_COMMENT", 
		"Identifier", "Letter", "LetterOrDigit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'('", "')'", "'='", "','", "'def'", "'module'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "DEF", "MODULE", "WS", "LINE_COMMENT", "Identifier"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13I\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\6\b.\n\b\r\b\16\b/\3\b\3\b\3\t\3\t\3\t\3\t\7\t"+
		"8\n\t\f\t\16\t;\13\t\3\t\3\t\3\n\3\n\7\nA\n\n\f\n\16\nD\13\n\3\13\3\13"+
		"\3\f\3\f\2\2\r\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\2\27\2\3\2"+
		"\6\5\2\13\f\16\17\"\"\4\2\f\f\17\17\6\2&&C\\aac|\7\2&&\62;C\\aac|\2I\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\3\31\3\2\2\2\5\33\3\2\2\2\7"+
		"\35\3\2\2\2\t\37\3\2\2\2\13!\3\2\2\2\r%\3\2\2\2\17-\3\2\2\2\21\63\3\2"+
		"\2\2\23>\3\2\2\2\25E\3\2\2\2\27G\3\2\2\2\31\32\7*\2\2\32\4\3\2\2\2\33"+
		"\34\7+\2\2\34\6\3\2\2\2\35\36\7?\2\2\36\b\3\2\2\2\37 \7.\2\2 \n\3\2\2"+
		"\2!\"\7f\2\2\"#\7g\2\2#$\7h\2\2$\f\3\2\2\2%&\7o\2\2&\'\7q\2\2\'(\7f\2"+
		"\2()\7w\2\2)*\7n\2\2*+\7g\2\2+\16\3\2\2\2,.\t\2\2\2-,\3\2\2\2./\3\2\2"+
		"\2/-\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62\b\b\2\2\62\20\3\2\2\2\63"+
		"\64\7\61\2\2\64\65\7\61\2\2\659\3\2\2\2\668\n\3\2\2\67\66\3\2\2\28;\3"+
		"\2\2\29\67\3\2\2\29:\3\2\2\2:<\3\2\2\2;9\3\2\2\2<=\b\t\2\2=\22\3\2\2\2"+
		">B\5\25\13\2?A\5\27\f\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\24\3"+
		"\2\2\2DB\3\2\2\2EF\t\4\2\2F\26\3\2\2\2GH\t\5\2\2H\30\3\2\2\2\6\2/9B\3"+
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