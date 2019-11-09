// Generated from c:\Users\LUCAS\Desktop\COMPILADORES\antlr_g1\Gramatica.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GramaticaParser extends Parser {
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
	public static final int
		RULE_gramatica = 0, RULE_line = 1, RULE_message = 2, RULE_name = 3, RULE_pessoa = 4, 
		RULE_command = 5, RULE_caracteristica = 6, RULE_emoticon = 7, RULE_link = 8, 
		RULE_color = 9, RULE_mention = 10, RULE_protocol = 11, RULE_domain = 12, 
		RULE_path = 13, RULE_url = 14, RULE_date = 15, RULE_relacionamento = 16, 
		RULE_tempo = 17;
	public static final String[] ruleNames = {
		"gramatica", "line", "message", "name", "pessoa", "command", "caracteristica", 
		"emoticon", "link", "color", "mention", "protocol", "domain", "path", 
		"url", "date", "relacionamento", "tempo"
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

	@Override
	public String getGrammarFileName() { return "Gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GramaticaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GramaticaParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public GramaticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gramatica; }
	}

	public final GramaticaContext gramatica() throws RecognitionException {
		GramaticaContext _localctx = new GramaticaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_gramatica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				line();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << WORD))) != 0) );
			setState(41);
			match(EOF);
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

	public static class LineContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<RelacionamentoContext> relacionamento() {
			return getRuleContexts(RelacionamentoContext.class);
		}
		public RelacionamentoContext relacionamento(int i) {
			return getRuleContext(RelacionamentoContext.class,i);
		}
		public List<CaracteristicaContext> caracteristica() {
			return getRuleContexts(CaracteristicaContext.class);
		}
		public CaracteristicaContext caracteristica(int i) {
			return getRuleContext(CaracteristicaContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(43);
					name();
					setState(44);
					match(T__0);
					setState(45);
					relacionamento();
					setState(46);
					name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(50); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(52);
				caracteristica();
				}
				}
				setState(57);
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

	public static class MessageContext extends ParserRuleContext {
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<EmoticonContext> emoticon() {
			return getRuleContexts(EmoticonContext.class);
		}
		public EmoticonContext emoticon(int i) {
			return getRuleContext(EmoticonContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public List<ColorContext> color() {
			return getRuleContexts(ColorContext.class);
		}
		public ColorContext color(int i) {
			return getRuleContext(ColorContext.class,i);
		}
		public List<MentionContext> mention() {
			return getRuleContexts(MentionContext.class);
		}
		public MentionContext mention(int i) {
			return getRuleContext(MentionContext.class,i);
		}
		public List<TerminalNode> WORD() { return getTokens(GramaticaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GramaticaParser.WORD, i);
		}
		public List<UrlContext> url() {
			return getRuleContexts(UrlContext.class);
		}
		public UrlContext url(int i) {
			return getRuleContext(UrlContext.class,i);
		}
		public MessageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_message; }
	}

	public final MessageContext message() throws RecognitionException {
		MessageContext _localctx = new MessageContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_message);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(65);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(58);
						date();
						}
						break;
					case 2:
						{
						setState(59);
						emoticon();
						}
						break;
					case 3:
						{
						setState(60);
						link();
						}
						break;
					case 4:
						{
						setState(61);
						color();
						}
						break;
					case 5:
						{
						setState(62);
						mention();
						}
						break;
					case 6:
						{
						setState(63);
						match(WORD);
						}
						break;
					case 7:
						{
						setState(64);
						url();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class NameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GramaticaParser.WORD, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << WORD))) != 0)) ) {
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

	public static class PessoaContext extends ParserRuleContext {
		public TerminalNode PESSOA() { return getToken(GramaticaParser.PESSOA, 0); }
		public PessoaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pessoa; }
	}

	public final PessoaContext pessoa() throws RecognitionException {
		PessoaContext _localctx = new PessoaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pessoa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(PESSOA);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode SAYS() { return getToken(GramaticaParser.SAYS, 0); }
		public TerminalNode SHOUTS() { return getToken(GramaticaParser.SHOUTS, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !(_la==SAYS || _la==SHOUTS) ) {
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

	public static class CaracteristicaContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public CaracteristicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caracteristica; }
	}

	public final CaracteristicaContext caracteristica() throws RecognitionException {
		CaracteristicaContext _localctx = new CaracteristicaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_caracteristica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(75);
			match(T__6);
			setState(76);
			date();
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

	public static class EmoticonContext extends ParserRuleContext {
		public EmoticonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emoticon; }
	}

	public final EmoticonContext emoticon() throws RecognitionException {
		EmoticonContext _localctx = new EmoticonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_emoticon);
		int _la;
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__7);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(79);
					match(T__8);
					}
				}

				setState(82);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(T__7);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(84);
					match(T__8);
					}
				}

				setState(87);
				match(T__10);
				}
				break;
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

	public static class LinkContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public List<TerminalNode> WORD() { return getTokens(GramaticaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GramaticaParser.WORD, i);
		}
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_link);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__11);
			setState(92); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(91);
				match(WORD);
				}
				}
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(96);
			match(T__12);
			setState(97);
			match(T__10);
			setState(98);
			url();
			setState(99);
			match(T__9);
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

	public static class ColorContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(GramaticaParser.WORD, 0); }
		public MessageContext message() {
			return getRuleContext(MessageContext.class,0);
		}
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__13);
			setState(102);
			match(WORD);
			setState(103);
			match(T__13);
			setState(104);
			message();
			setState(105);
			match(T__13);
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

	public static class MentionContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public MentionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mention; }
	}

	public final MentionContext mention() throws RecognitionException {
		MentionContext _localctx = new MentionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mention);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__14);
			setState(108);
			name();
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

	public static class ProtocolContext extends ParserRuleContext {
		public ProtocolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocol; }
	}

	public final ProtocolContext protocol() throws RecognitionException {
		ProtocolContext _localctx = new ProtocolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_protocol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__15);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__16) {
				{
				setState(111);
				match(T__16);
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

	public static class DomainContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(GramaticaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GramaticaParser.WORD, i);
		}
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_domain);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(114);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==WORD) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(117); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> WORD() { return getTokens(GramaticaParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(GramaticaParser.WORD, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_path);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(119);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__17) | (1L << WORD))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class UrlContext extends ParserRuleContext {
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public ProtocolContext protocol() {
			return getRuleContext(ProtocolContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(124);
				protocol();
				setState(125);
				match(T__7);
				setState(126);
				match(T__18);
				}
			}

			setState(130);
			domain();
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(131);
				path();
				}
				break;
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

	public static class DateContext extends ParserRuleContext {
		public TerminalNode DATE() { return getToken(GramaticaParser.DATE, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_date);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__6);
			setState(135);
			match(DATE);
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

	public static class RelacionamentoContext extends ParserRuleContext {
		public TerminalNode RELACIONAMENTO() { return getToken(GramaticaParser.RELACIONAMENTO, 0); }
		public RelacionamentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relacionamento; }
	}

	public final RelacionamentoContext relacionamento() throws RecognitionException {
		RelacionamentoContext _localctx = new RelacionamentoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_relacionamento);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(RELACIONAMENTO);
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

	public static class TempoContext extends ParserRuleContext {
		public TempoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tempo; }
	}

	public final TempoContext tempo() throws RecognitionException {
		TempoContext _localctx = new TempoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tempo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0090\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\2\3\2\3\3\3\3\3\3\3\3\3\3\6\3\63\n"+
		"\3\r\3\16\3\64\3\3\7\38\n\3\f\3\16\3;\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\6\4D\n\4\r\4\16\4E\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\5\tS\n"+
		"\t\3\t\3\t\3\t\5\tX\n\t\3\t\5\t[\n\t\3\n\3\n\6\n_\n\n\r\n\16\n`\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\5\rs"+
		"\n\r\3\16\6\16v\n\16\r\16\16\16w\3\17\6\17{\n\17\r\17\16\17|\3\20\3\20"+
		"\3\20\3\20\5\20\u0083\n\20\3\20\3\20\5\20\u0087\n\20\3\21\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$\2\7\4\2\4\b\35\35\3\2\33\34\4\2\24\24\35\35\5\2\20\20\24\24\35\35"+
		"\3\2\26\30\2\u0090\2\'\3\2\2\2\4\62\3\2\2\2\6C\3\2\2\2\bG\3\2\2\2\nI\3"+
		"\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20Z\3\2\2\2\22\\\3\2\2\2\24g\3\2\2\2\26"+
		"m\3\2\2\2\30p\3\2\2\2\32u\3\2\2\2\34z\3\2\2\2\36\u0082\3\2\2\2 \u0088"+
		"\3\2\2\2\"\u008b\3\2\2\2$\u008d\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2"+
		")\'\3\2\2\2)*\3\2\2\2*+\3\2\2\2+,\7\2\2\3,\3\3\2\2\2-.\5\b\5\2./\7\3\2"+
		"\2/\60\5\"\22\2\60\61\5\b\5\2\61\63\3\2\2\2\62-\3\2\2\2\63\64\3\2\2\2"+
		"\64\62\3\2\2\2\64\65\3\2\2\2\659\3\2\2\2\668\5\16\b\2\67\66\3\2\2\28;"+
		"\3\2\2\29\67\3\2\2\29:\3\2\2\2:\5\3\2\2\2;9\3\2\2\2<D\5 \21\2=D\5\20\t"+
		"\2>D\5\22\n\2?D\5\24\13\2@D\5\26\f\2AD\7\35\2\2BD\5\36\20\2C<\3\2\2\2"+
		"C=\3\2\2\2C>\3\2\2\2C?\3\2\2\2C@\3\2\2\2CA\3\2\2\2CB\3\2\2\2DE\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GH\t\2\2\2H\t\3\2\2\2IJ\7\32\2\2J\13\3"+
		"\2\2\2KL\t\3\2\2L\r\3\2\2\2MN\7\t\2\2NO\5 \21\2O\17\3\2\2\2PR\7\n\2\2"+
		"QS\7\13\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2T[\7\f\2\2UW\7\n\2\2VX\7\13\2"+
		"\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2Y[\7\r\2\2ZP\3\2\2\2ZU\3\2\2\2[\21\3\2"+
		"\2\2\\^\7\16\2\2]_\7\35\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab"+
		"\3\2\2\2bc\7\17\2\2cd\7\r\2\2de\5\36\20\2ef\7\f\2\2f\23\3\2\2\2gh\7\20"+
		"\2\2hi\7\35\2\2ij\7\20\2\2jk\5\6\4\2kl\7\20\2\2l\25\3\2\2\2mn\7\21\2\2"+
		"no\5\b\5\2o\27\3\2\2\2pr\7\22\2\2qs\7\23\2\2rq\3\2\2\2rs\3\2\2\2s\31\3"+
		"\2\2\2tv\t\4\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\33\3\2\2\2y"+
		"{\t\5\2\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\35\3\2\2\2~\177\5\30"+
		"\r\2\177\u0080\7\n\2\2\u0080\u0081\7\25\2\2\u0081\u0083\3\2\2\2\u0082"+
		"~\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0086\5\32\16"+
		"\2\u0085\u0087\5\34\17\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\37\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u008a\7$\2\2\u008a!\3\2\2\2\u008b"+
		"\u008c\7\31\2\2\u008c#\3\2\2\2\u008d\u008e\t\6\2\2\u008e%\3\2\2\2\20)"+
		"\649CERWZ`rw|\u0082\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}