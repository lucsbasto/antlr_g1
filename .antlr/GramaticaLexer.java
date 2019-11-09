// Generated from c:\Users\LUCAS\Desktop\COMPILADORES\antlr_g1\Gramatica.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, RELACIONAMENTO=23, PESSOA=24, 
		SAYS=25, SHOUTS=26, WORD=27, WHITESPACE=28, NEWLINE=29, NUMBER=30, DIA=31, 
		MES=32, ANO=33, DATE=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "A", "S", "Y", "H", "O", 
		"U", "T", "LOWERCASE", "UPPERCASE", "DIGIT", "RELACIONAMENTO", "PESSOA", 
		"SAYS", "SHOUTS", "WORD", "WHITESPACE", "NEWLINE", "NUMBER", "DIA", "MES", 
		"ANO", "DATE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'Jose'", "'Maria'", "'Joao'", "'Marta'", "'Pedro'", "'em '", 
		"':'", "'-'", "')'", "'('", "'['", "']'", "'/'", "'@'", "'http'", "'s'", 
		"'.'", "'//'", "'ano(s)'", "'mes(es)'", "'dia(s)'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "RELACIONAMENTO", 
		"PESSOA", "SAYS", "SHOUTS", "WORD", "WHITESPACE", "NEWLINE", "NUMBER", 
		"DIA", "MES", "ANO", "DATE"
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


	public GramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u012b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u00e4\n\"\3#\3#\6"+
		"#\u00e8\n#\r#\16#\u00e9\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\6"+
		"&\u00fb\n&\r&\16&\u00fc\3\'\3\'\3\'\3\'\3(\5(\u0104\n(\3(\3(\6(\u0108"+
		"\n(\r(\16(\u0109\3(\3(\3)\6)\u010f\n)\r)\16)\u0110\3)\3)\6)\u0115\n)\r"+
		")\16)\u0116\5)\u0119\n)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3"+
		"-\3-\2\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\2\61\2\63\2\65\2\67\29\2"+
		";\2=\2?\2A\2C\31E\32G\33I\34K\35M\36O\37Q S!U\"W#Y$\3\2\16\4\2CCcc\4\2"+
		"UUuu\4\2[[{{\4\2JJjj\4\2QQqq\4\2WWww\4\2VVvv\3\2c|\3\2C\\\3\2\62;\4\2"+
		"\13\13\"\"\4\2..\60\60\2\u012d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\3[\3\2\2\2\5]\3\2\2\2\7b\3\2\2\2\th\3\2\2\2\13m\3\2\2\2"+
		"\rs\3\2\2\2\17y\3\2\2\2\21}\3\2\2\2\23\177\3\2\2\2\25\u0081\3\2\2\2\27"+
		"\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3\2\2\2\37\u008b"+
		"\3\2\2\2!\u008d\3\2\2\2#\u0092\3\2\2\2%\u0094\3\2\2\2\'\u0096\3\2\2\2"+
		")\u0099\3\2\2\2+\u00a0\3\2\2\2-\u00a8\3\2\2\2/\u00af\3\2\2\2\61\u00b1"+
		"\3\2\2\2\63\u00b3\3\2\2\2\65\u00b5\3\2\2\2\67\u00b7\3\2\2\29\u00b9\3\2"+
		"\2\2;\u00bb\3\2\2\2=\u00bd\3\2\2\2?\u00bf\3\2\2\2A\u00c1\3\2\2\2C\u00e3"+
		"\3\2\2\2E\u00e7\3\2\2\2G\u00eb\3\2\2\2I\u00f0\3\2\2\2K\u00fa\3\2\2\2M"+
		"\u00fe\3\2\2\2O\u0107\3\2\2\2Q\u010e\3\2\2\2S\u011a\3\2\2\2U\u011d\3\2"+
		"\2\2W\u0120\3\2\2\2Y\u0125\3\2\2\2[\\\7.\2\2\\\4\3\2\2\2]^\7L\2\2^_\7"+
		"q\2\2_`\7u\2\2`a\7g\2\2a\6\3\2\2\2bc\7O\2\2cd\7c\2\2de\7t\2\2ef\7k\2\2"+
		"fg\7c\2\2g\b\3\2\2\2hi\7L\2\2ij\7q\2\2jk\7c\2\2kl\7q\2\2l\n\3\2\2\2mn"+
		"\7O\2\2no\7c\2\2op\7t\2\2pq\7v\2\2qr\7c\2\2r\f\3\2\2\2st\7R\2\2tu\7g\2"+
		"\2uv\7f\2\2vw\7t\2\2wx\7q\2\2x\16\3\2\2\2yz\7g\2\2z{\7o\2\2{|\7\"\2\2"+
		"|\20\3\2\2\2}~\7<\2\2~\22\3\2\2\2\177\u0080\7/\2\2\u0080\24\3\2\2\2\u0081"+
		"\u0082\7+\2\2\u0082\26\3\2\2\2\u0083\u0084\7*\2\2\u0084\30\3\2\2\2\u0085"+
		"\u0086\7]\2\2\u0086\32\3\2\2\2\u0087\u0088\7_\2\2\u0088\34\3\2\2\2\u0089"+
		"\u008a\7\61\2\2\u008a\36\3\2\2\2\u008b\u008c\7B\2\2\u008c \3\2\2\2\u008d"+
		"\u008e\7j\2\2\u008e\u008f\7v\2\2\u008f\u0090\7v\2\2\u0090\u0091\7r\2\2"+
		"\u0091\"\3\2\2\2\u0092\u0093\7u\2\2\u0093$\3\2\2\2\u0094\u0095\7\60\2"+
		"\2\u0095&\3\2\2\2\u0096\u0097\7\61\2\2\u0097\u0098\7\61\2\2\u0098(\3\2"+
		"\2\2\u0099\u009a\7c\2\2\u009a\u009b\7p\2\2\u009b\u009c\7q\2\2\u009c\u009d"+
		"\7*\2\2\u009d\u009e\7u\2\2\u009e\u009f\7+\2\2\u009f*\3\2\2\2\u00a0\u00a1"+
		"\7o\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7*\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7+\2\2\u00a7,\3\2\2\2\u00a8"+
		"\u00a9\7f\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7*\2\2"+
		"\u00ac\u00ad\7u\2\2\u00ad\u00ae\7+\2\2\u00ae.\3\2\2\2\u00af\u00b0\t\2"+
		"\2\2\u00b0\60\3\2\2\2\u00b1\u00b2\t\3\2\2\u00b2\62\3\2\2\2\u00b3\u00b4"+
		"\t\4\2\2\u00b4\64\3\2\2\2\u00b5\u00b6\t\5\2\2\u00b6\66\3\2\2\2\u00b7\u00b8"+
		"\t\6\2\2\u00b88\3\2\2\2\u00b9\u00ba\t\7\2\2\u00ba:\3\2\2\2\u00bb\u00bc"+
		"\t\b\2\2\u00bc<\3\2\2\2\u00bd\u00be\t\t\2\2\u00be>\3\2\2\2\u00bf\u00c0"+
		"\t\n\2\2\u00c0@\3\2\2\2\u00c1\u00c2\t\13\2\2\u00c2B\3\2\2\2\u00c3\u00c4"+
		"\7e\2\2\u00c4\u00c5\7c\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7c\2\2\u00c7"+
		"\u00c8\7f\2\2\u00c8\u00c9\7q\2\2\u00c9\u00ca\7*\2\2\u00ca\u00cb\7c\2\2"+
		"\u00cb\u00cc\7+\2\2\u00cc\u00cd\7\"\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7q\2\2\u00cf\u00e4\7o\2\2\u00d0\u00d1\7h\2\2\u00d1\u00d2\7k\2\2\u00d2"+
		"\u00d3\7n\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7\"\2"+
		"\2\u00d6\u00d7\7f\2\2\u00d7\u00e4\7g\2\2\u00d8\u00d9\7c\2\2\u00d9\u00da"+
		"\7o\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7i\2\2\u00dc\u00dd\7q\2\2\u00dd"+
		"\u00de\7*\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7+\2\2\u00e0\u00e1\7\"\2"+
		"\2\u00e1\u00e2\7f\2\2\u00e2\u00e4\7g\2\2\u00e3\u00c3\3\2\2\2\u00e3\u00d0"+
		"\3\2\2\2\u00e3\u00d8\3\2\2\2\u00e4D\3\2\2\2\u00e5\u00e8\5=\37\2\u00e6"+
		"\u00e8\5? \2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2"+
		"\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00eaF\3\2\2\2\u00eb\u00ec"+
		"\5\61\31\2\u00ec\u00ed\5/\30\2\u00ed\u00ee\5\63\32\2\u00ee\u00ef\5\61"+
		"\31\2\u00efH\3\2\2\2\u00f0\u00f1\5\61\31\2\u00f1\u00f2\5\65\33\2\u00f2"+
		"\u00f3\5\67\34\2\u00f3\u00f4\59\35\2\u00f4\u00f5\5;\36\2\u00f5\u00f6\5"+
		"\61\31\2\u00f6J\3\2\2\2\u00f7\u00fb\5=\37\2\u00f8\u00fb\5? \2\u00f9\u00fb"+
		"\7a\2\2\u00fa\u00f7\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fdL\3\2\2\2"+
		"\u00fe\u00ff\t\f\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\b\'\2\2\u0101N\3"+
		"\2\2\2\u0102\u0104\7\17\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0108\7\f\2\2\u0106\u0108\7\17\2\2\u0107\u0103\3"+
		"\2\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\b(\2\2\u010cP\3\2\2\2\u010d"+
		"\u010f\5A!\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2"+
		"\2\u0110\u0111\3\2\2\2\u0111\u0118\3\2\2\2\u0112\u0114\t\r\2\2\u0113\u0115"+
		"\5A!\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0119\3\2\2\2\u0118\u0112\3\2\2\2\u0118\u0119\3\2"+
		"\2\2\u0119R\3\2\2\2\u011a\u011b\5A!\2\u011b\u011c\5A!\2\u011cT\3\2\2\2"+
		"\u011d\u011e\5A!\2\u011e\u011f\5A!\2\u011fV\3\2\2\2\u0120\u0121\5A!\2"+
		"\u0121\u0122\5A!\2\u0122\u0123\5A!\2\u0123\u0124\5A!\2\u0124X\3\2\2\2"+
		"\u0125\u0126\5S*\2\u0126\u0127\7\61\2\2\u0127\u0128\5U+\2\u0128\u0129"+
		"\7\61\2\2\u0129\u012a\5W,\2\u012aZ\3\2\2\2\16\2\u00e3\u00e7\u00e9\u00fa"+
		"\u00fc\u0103\u0107\u0109\u0110\u0116\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}