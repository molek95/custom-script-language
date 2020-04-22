// Generated from ScriptLanguage.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScriptLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, ABS=2, TIME=3, INT=4, DOUBLE=5, FOR=6, WHILE=7, BREAK=8, CONTINUE=9, 
		IF=10, THEN=11, ELSE=12, SWITCH=13, CASE=14, DEFAULT=15, SEMICOLON=16, 
		ADD=17, SUB=18, MUL=19, DIV=20, LPAR=21, RPAR=22, LBRACE=23, RBRACE=24, 
		KERDOJEL=25, ASSIGN=26, EQUALS=27, LESSTHEN=28, GREATERTHEN=29, COLON=30, 
		COMMA=31, VARNAME=32, NUMBER=33, WHITESPACE=34, NEWLINE=35;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_controlStructures = 2, RULE_declaration = 3, 
		RULE_assignment = 4, RULE_ifStatement = 5, RULE_shortIfStatement = 6, 
		RULE_switchCaseStatement = 7, RULE_forLoop = 8, RULE_whileLoop = 9, RULE_exp = 10, 
		RULE_addop = 11, RULE_mulop = 12, RULE_fct = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "controlStructures", "declaration", "assignment", 
			"ifStatement", "shortIfStatement", "switchCaseStatement", "forLoop", 
			"whileLoop", "exp", "addop", "mulop", "fct"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'ABS'", "'TIME'", "'int'", "'double'", "'for'", "'while'", 
			"'break'", "'continue'", "'if'", "'then'", "'else'", "'switch'", "'case'", 
			"'default'", "';'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'{'", 
			"'}'", "'?'", "'='", "'=='", "'<'", "'>'", "':'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "ABS", "TIME", "INT", "DOUBLE", "FOR", "WHILE", "BREAK", 
			"CONTINUE", "IF", "THEN", "ELSE", "SWITCH", "CASE", "DEFAULT", "SEMICOLON", 
			"ADD", "SUB", "MUL", "DIV", "LPAR", "RPAR", "LBRACE", "RBRACE", "KERDOJEL", 
			"ASSIGN", "EQUALS", "LESSTHEN", "GREATERTHEN", "COLON", "COMMA", "VARNAME", 
			"NUMBER", "WHITESPACE", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "ScriptLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private java.util.Map<String,Double> ids = new java.util.TreeMap<String,Double>();
	    
	    public static void main(String[] args) throws Exception {
	        ScriptLanguageLexer lex = new ScriptLanguageLexer(new ANTLRFileStream(args[0]));
	        CommonTokenStream tokens = new CommonTokenStream(lex);
	        ScriptLanguageParser parser = new ScriptLanguageParser(tokens);
	        parser.program();
	    }

	public ScriptLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public CommandContext command;
		public TerminalNode EOF() { return getToken(ScriptLanguageParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		 ast.Program p = new ast.Program(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				((ProgramContext)_localctx).command = command();
				 p.addExpression(((ProgramContext)_localctx).command.value); 
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << DOUBLE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << LPAR) | (1L << VARNAME))) != 0) );
			setState(35);
			match(EOF);
			}
			_ctx.stop = _input.LT(-1);
			 p.evaluate(); 
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
		public ast.Expression value;
		public AssignmentContext fstop;
		public DeclarationContext nxtop;
		public ExpContext nxtop2;
		public ExpContext nxtop3;
		public ControlStructuresContext controlStructures;
		public TerminalNode SEMICOLON() { return getToken(ScriptLanguageParser.SEMICOLON, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode PRINT() { return getToken(ScriptLanguageParser.PRINT, 0); }
		public TerminalNode LPAR() { return getToken(ScriptLanguageParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ScriptLanguageParser.RPAR, 0); }
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ScriptLanguageParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ScriptLanguageParser.COMMA, i);
		}
		public ControlStructuresContext controlStructures() {
			return getRuleContext(ControlStructuresContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				((CommandContext)_localctx).fstop = assignment();
				setState(38);
				match(SEMICOLON);
				((CommandContext)_localctx).value =  ((CommandContext)_localctx).fstop.value;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				((CommandContext)_localctx).nxtop = declaration();
				setState(42);
				match(SEMICOLON);
				((CommandContext)_localctx).value =  ((CommandContext)_localctx).nxtop.value;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(PRINT);
				setState(46);
				match(LPAR);
				((CommandContext)_localctx).value =  new ast.Print();
				setState(48);
				((CommandContext)_localctx).nxtop2 = exp();
				((ast.Print)_localctx.value).addExpression(((CommandContext)_localctx).nxtop2.value);
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(50);
					match(COMMA);
					setState(51);
					((CommandContext)_localctx).nxtop3 = exp();
					((ast.Print)_localctx.value).addExpression(((CommandContext)_localctx).nxtop3.value);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(RPAR);
				setState(60);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				((CommandContext)_localctx).controlStructures = controlStructures();
				((CommandContext)_localctx).value =  ((CommandContext)_localctx).controlStructures.value;
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

	public static class ControlStructuresContext extends ParserRuleContext {
		public ast.Expression value;
		public IfStatementContext ifStatement;
		public ShortIfStatementContext shortIfStatement;
		public SwitchCaseStatementContext switchCaseStatement;
		public ForLoopContext forLoop;
		public WhileLoopContext whileLoop;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ShortIfStatementContext shortIfStatement() {
			return getRuleContext(ShortIfStatementContext.class,0);
		}
		public SwitchCaseStatementContext switchCaseStatement() {
			return getRuleContext(SwitchCaseStatementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ControlStructuresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStructures; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterControlStructures(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitControlStructures(this);
		}
	}

	public final ControlStructuresContext controlStructures() throws RecognitionException {
		ControlStructuresContext _localctx = new ControlStructuresContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_controlStructures);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((ControlStructuresContext)_localctx).ifStatement = ifStatement();
				((ControlStructuresContext)_localctx).value =  ((ControlStructuresContext)_localctx).ifStatement.value;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				((ControlStructuresContext)_localctx).shortIfStatement = shortIfStatement();
				((ControlStructuresContext)_localctx).value =  ((ControlStructuresContext)_localctx).shortIfStatement.value;
				}
				break;
			case SWITCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				((ControlStructuresContext)_localctx).switchCaseStatement = switchCaseStatement();
				((ControlStructuresContext)_localctx).value =  ((ControlStructuresContext)_localctx).switchCaseStatement.value;
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(76);
				((ControlStructuresContext)_localctx).forLoop = forLoop();
				((ControlStructuresContext)_localctx).value =  ((ControlStructuresContext)_localctx).forLoop.value;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(79);
				((ControlStructuresContext)_localctx).whileLoop = whileLoop();
				((ControlStructuresContext)_localctx).value =  ((ControlStructuresContext)_localctx).whileLoop.value;
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

	public static class DeclarationContext extends ParserRuleContext {
		public ast.Expression value;
		public Token VARNAME;
		public TerminalNode VARNAME() { return getToken(ScriptLanguageParser.VARNAME, 0); }
		public TerminalNode INT() { return getToken(ScriptLanguageParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(ScriptLanguageParser.DOUBLE, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			((DeclarationContext)_localctx).VARNAME = match(VARNAME);
			 ((DeclarationContext)_localctx).value =  new ast.Assignment(new ast.Identifier((((DeclarationContext)_localctx).VARNAME!=null?((DeclarationContext)_localctx).VARNAME.getText():null))); 
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

	public static class AssignmentContext extends ParserRuleContext {
		public ast.Expression value;
		public Token VARNAME;
		public ExpContext exp;
		public TerminalNode VARNAME() { return getToken(ScriptLanguageParser.VARNAME, 0); }
		public TerminalNode ASSIGN() { return getToken(ScriptLanguageParser.ASSIGN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode INT() { return getToken(ScriptLanguageParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(ScriptLanguageParser.DOUBLE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT || _la==DOUBLE) {
				{
				setState(88);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==DOUBLE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(91);
			((AssignmentContext)_localctx).VARNAME = match(VARNAME);
			setState(92);
			match(ASSIGN);
			setState(93);
			((AssignmentContext)_localctx).exp = exp();
			 ((AssignmentContext)_localctx).value =  new ast.Assignment(new ast.Identifier((((AssignmentContext)_localctx).VARNAME!=null?((AssignmentContext)_localctx).VARNAME.getText():null)), ((AssignmentContext)_localctx).exp.value); 
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

	public static class IfStatementContext extends ParserRuleContext {
		public ast.Expression value;
		public ExpContext fstop;
		public CommandContext nxtop;
		public CommandContext nxtop2;
		public TerminalNode IF() { return getToken(ScriptLanguageParser.IF, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(ScriptLanguageParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(ScriptLanguageParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(ScriptLanguageParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(ScriptLanguageParser.RBRACE, i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(ScriptLanguageParser.ELSE, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(IF);
			setState(97);
			((IfStatementContext)_localctx).fstop = exp();
			((IfStatementContext)_localctx).value = new ast.If(((IfStatementContext)_localctx).fstop.value);
			setState(99);
			match(LBRACE);
			setState(103); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				((IfStatementContext)_localctx).nxtop = command();
				((ast.If)_localctx.value).addDoExpression(((IfStatementContext)_localctx).nxtop.value);
				}
				}
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << DOUBLE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << LPAR) | (1L << VARNAME))) != 0) );
			setState(107);
			match(RBRACE);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(108);
				match(ELSE);
				setState(109);
				match(LBRACE);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << DOUBLE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << LPAR) | (1L << VARNAME))) != 0)) {
					{
					{
					setState(110);
					((IfStatementContext)_localctx).nxtop2 = command();
					((ast.If)_localctx.value).addElseExpression(((IfStatementContext)_localctx).nxtop2.value);
					}
					}
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(120);
			match(RBRACE);
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

	public static class ShortIfStatementContext extends ParserRuleContext {
		public ast.Expression value;
		public ExpContext fstop;
		public CommandContext nxtop;
		public CommandContext nxtop2;
		public List<TerminalNode> LPAR() { return getTokens(ScriptLanguageParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(ScriptLanguageParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(ScriptLanguageParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(ScriptLanguageParser.RPAR, i);
		}
		public TerminalNode KERDOJEL() { return getToken(ScriptLanguageParser.KERDOJEL, 0); }
		public TerminalNode COLON() { return getToken(ScriptLanguageParser.COLON, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ShortIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shortIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterShortIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitShortIfStatement(this);
		}
	}

	public final ShortIfStatementContext shortIfStatement() throws RecognitionException {
		ShortIfStatementContext _localctx = new ShortIfStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_shortIfStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LPAR);
			setState(123);
			((ShortIfStatementContext)_localctx).fstop = exp();
			((ShortIfStatementContext)_localctx).value = new ast.If(((ShortIfStatementContext)_localctx).fstop.value);
			setState(125);
			match(RPAR);
			setState(126);
			match(KERDOJEL);
			setState(127);
			match(LPAR);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(128);
				((ShortIfStatementContext)_localctx).nxtop = command();
				((ast.If)_localctx.value).addDoExpression(((ShortIfStatementContext)_localctx).nxtop.value);
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << DOUBLE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << LPAR) | (1L << VARNAME))) != 0) );
			setState(135);
			match(RPAR);
			setState(136);
			match(COLON);
			setState(137);
			match(LPAR);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << DOUBLE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << LPAR) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(138);
				((ShortIfStatementContext)_localctx).nxtop2 = command();
				((ast.If)_localctx.value).addElseExpression(((ShortIfStatementContext)_localctx).nxtop2.value);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			match(RPAR);
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

	public static class SwitchCaseStatementContext extends ParserRuleContext {
		public ast.Expression value;
		public Token VARNAME;
		public FctContext fstop;
		public CommandContext nxtop;
		public CommandContext nxtop2;
		public TerminalNode SWITCH() { return getToken(ScriptLanguageParser.SWITCH, 0); }
		public TerminalNode LPAR() { return getToken(ScriptLanguageParser.LPAR, 0); }
		public TerminalNode VARNAME() { return getToken(ScriptLanguageParser.VARNAME, 0); }
		public TerminalNode RPAR() { return getToken(ScriptLanguageParser.RPAR, 0); }
		public List<TerminalNode> COLON() { return getTokens(ScriptLanguageParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ScriptLanguageParser.COLON, i);
		}
		public TerminalNode LBRACE() { return getToken(ScriptLanguageParser.LBRACE, 0); }
		public List<TerminalNode> BREAK() { return getTokens(ScriptLanguageParser.BREAK); }
		public TerminalNode BREAK(int i) {
			return getToken(ScriptLanguageParser.BREAK, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(ScriptLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ScriptLanguageParser.SEMICOLON, i);
		}
		public TerminalNode RBRACE() { return getToken(ScriptLanguageParser.RBRACE, 0); }
		public TerminalNode DEFAULT() { return getToken(ScriptLanguageParser.DEFAULT, 0); }
		public List<TerminalNode> CASE() { return getTokens(ScriptLanguageParser.CASE); }
		public TerminalNode CASE(int i) {
			return getToken(ScriptLanguageParser.CASE, i);
		}
		public List<FctContext> fct() {
			return getRuleContexts(FctContext.class);
		}
		public FctContext fct(int i) {
			return getRuleContext(FctContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public SwitchCaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCaseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterSwitchCaseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitSwitchCaseStatement(this);
		}
	}

	public final SwitchCaseStatementContext switchCaseStatement() throws RecognitionException {
		SwitchCaseStatementContext _localctx = new SwitchCaseStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_switchCaseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(SWITCH);
			setState(149);
			match(LPAR);
			setState(150);
			((SwitchCaseStatementContext)_localctx).VARNAME = match(VARNAME);
			 ((SwitchCaseStatementContext)_localctx).value = new ast.SwitchCase((((SwitchCaseStatementContext)_localctx).VARNAME!=null?((SwitchCaseStatementContext)_localctx).VARNAME.getText():null));
			setState(152);
			match(RPAR);
			setState(153);
			match(COLON);
			setState(154);
			match(LBRACE);
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(155);
				match(CASE);
				setState(156);
				((SwitchCaseStatementContext)_localctx).fstop = fct();
				((ast.SwitchCase)_localctx.value).addCase(((SwitchCaseStatementContext)_localctx).fstop.value);
				setState(158);
				match(COLON);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << DOUBLE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << LPAR) | (1L << VARNAME))) != 0)) {
					{
					{
					setState(159);
					((SwitchCaseStatementContext)_localctx).nxtop = command();
					((ast.SwitchCase)_localctx.value).addDoExpression(((SwitchCaseStatementContext)_localctx).fstop.value, ((SwitchCaseStatementContext)_localctx).nxtop.value);
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE );
			setState(171);
			match(BREAK);
			setState(172);
			match(SEMICOLON);
			{
			setState(173);
			match(DEFAULT);
			setState(174);
			match(COLON);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << DOUBLE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << LPAR) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(175);
				((SwitchCaseStatementContext)_localctx).nxtop2 = command();
				((ast.SwitchCase)_localctx.value).addElseExpression(((SwitchCaseStatementContext)_localctx).nxtop2.value);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(183);
			match(BREAK);
			setState(184);
			match(SEMICOLON);
			setState(185);
			match(RBRACE);
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

	public static class ForLoopContext extends ParserRuleContext {
		public ast.Expression value;
		public AssignmentContext fstop;
		public ExpContext nextop;
		public AssignmentContext nextop2;
		public CommandContext nextop3;
		public TerminalNode FOR() { return getToken(ScriptLanguageParser.FOR, 0); }
		public TerminalNode LPAR() { return getToken(ScriptLanguageParser.LPAR, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(ScriptLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(ScriptLanguageParser.SEMICOLON, i);
		}
		public TerminalNode RPAR() { return getToken(ScriptLanguageParser.RPAR, 0); }
		public TerminalNode LBRACE() { return getToken(ScriptLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ScriptLanguageParser.RBRACE, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitForLoop(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(FOR);
			setState(188);
			match(LPAR);
			setState(189);
			((ForLoopContext)_localctx).fstop = assignment();
			setState(190);
			match(SEMICOLON);
			setState(191);
			((ForLoopContext)_localctx).nextop = exp();
			setState(192);
			match(SEMICOLON);
			setState(193);
			((ForLoopContext)_localctx).nextop2 = assignment();
			((ForLoopContext)_localctx).value =  new ast.For(((ForLoopContext)_localctx).fstop.value, ((ForLoopContext)_localctx).nextop.value, ((ForLoopContext)_localctx).nextop2.value);
			setState(195);
			match(RPAR);
			setState(196);
			match(LBRACE);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << DOUBLE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << LPAR) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(197);
				((ForLoopContext)_localctx).nextop3 = command();
				((ast.For)_localctx.value).addExpression(((ForLoopContext)_localctx).nextop3.value); 
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(RBRACE);
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

	public static class WhileLoopContext extends ParserRuleContext {
		public ast.Expression value;
		public ExpContext fstop;
		public CommandContext nextop;
		public TerminalNode WHILE() { return getToken(ScriptLanguageParser.WHILE, 0); }
		public TerminalNode LBRACE() { return getToken(ScriptLanguageParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ScriptLanguageParser.RBRACE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitWhileLoop(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileLoop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(WHILE);
			{
			setState(208);
			((WhileLoopContext)_localctx).fstop = exp();
			((WhileLoopContext)_localctx).value =  new ast.While(((WhileLoopContext)_localctx).fstop.value);
			}
			setState(211);
			match(LBRACE);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << DOUBLE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << SWITCH) | (1L << LPAR) | (1L << VARNAME))) != 0)) {
				{
				{
				setState(212);
				((WhileLoopContext)_localctx).nextop = command();
				((ast.While)_localctx.value).addExpression(((WhileLoopContext)_localctx).nextop.value);
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(RBRACE);
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

	public static class ExpContext extends ParserRuleContext {
		public ast.Expression value;
		public AddopContext fstop;
		public AddopContext nxtop;
		public AddopContext nxtop2;
		public AddopContext nxtop3;
		public List<AddopContext> addop() {
			return getRuleContexts(AddopContext.class);
		}
		public AddopContext addop(int i) {
			return getRuleContext(AddopContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(ScriptLanguageParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(ScriptLanguageParser.EQUALS, i);
		}
		public List<TerminalNode> LESSTHEN() { return getTokens(ScriptLanguageParser.LESSTHEN); }
		public TerminalNode LESSTHEN(int i) {
			return getToken(ScriptLanguageParser.LESSTHEN, i);
		}
		public List<TerminalNode> GREATERTHEN() { return getTokens(ScriptLanguageParser.GREATERTHEN); }
		public TerminalNode GREATERTHEN(int i) {
			return getToken(ScriptLanguageParser.GREATERTHEN, i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			((ExpContext)_localctx).fstop = addop();
			 ((ExpContext)_localctx).value =  ((ExpContext)_localctx).fstop.value; 
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALS) | (1L << LESSTHEN) | (1L << GREATERTHEN))) != 0)) {
				{
				setState(236);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EQUALS:
					{
					setState(224);
					match(EQUALS);
					setState(225);
					((ExpContext)_localctx).nxtop = addop();
					 ((ExpContext)_localctx).value =  new ast.Operator(ast.Operator.EQ, _localctx.value, ((ExpContext)_localctx).nxtop.value); 
					}
					break;
				case LESSTHEN:
					{
					setState(228);
					match(LESSTHEN);
					setState(229);
					((ExpContext)_localctx).nxtop2 = addop();
					 ((ExpContext)_localctx).value =  new ast.Operator(ast.Operator.LT, _localctx.value, ((ExpContext)_localctx).nxtop2.value); 
					}
					break;
				case GREATERTHEN:
					{
					setState(232);
					match(GREATERTHEN);
					setState(233);
					((ExpContext)_localctx).nxtop3 = addop();
					 ((ExpContext)_localctx).value =  new ast.Operator(ast.Operator.GT, _localctx.value, ((ExpContext)_localctx).nxtop3.value); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(240);
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

	public static class AddopContext extends ParserRuleContext {
		public ast.Expression value;
		public MulopContext fstop;
		public MulopContext nxtop;
		public MulopContext nxtop2;
		public List<MulopContext> mulop() {
			return getRuleContexts(MulopContext.class);
		}
		public MulopContext mulop(int i) {
			return getRuleContext(MulopContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(ScriptLanguageParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(ScriptLanguageParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(ScriptLanguageParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(ScriptLanguageParser.SUB, i);
		}
		public AddopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterAddop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitAddop(this);
		}
	}

	public final AddopContext addop() throws RecognitionException {
		AddopContext _localctx = new AddopContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((AddopContext)_localctx).fstop = mulop();
			 ((AddopContext)_localctx).value =  ((AddopContext)_localctx).fstop.value; 
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				setState(251);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ADD:
					{
					setState(243);
					match(ADD);
					setState(244);
					((AddopContext)_localctx).nxtop = mulop();
					 ((AddopContext)_localctx).value =  new ast.Operator(ast.Operator.ADD, _localctx.value, ((AddopContext)_localctx).nxtop.value); 
					}
					break;
				case SUB:
					{
					setState(247);
					match(SUB);
					setState(248);
					((AddopContext)_localctx).nxtop2 = mulop();
					 ((AddopContext)_localctx).value =  new ast.Operator(ast.Operator.SUB, _localctx.value, ((AddopContext)_localctx).nxtop2.value); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(255);
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

	public static class MulopContext extends ParserRuleContext {
		public ast.Expression value;
		public FctContext fstop;
		public FctContext nxtop;
		public FctContext nxtop2;
		public List<FctContext> fct() {
			return getRuleContexts(FctContext.class);
		}
		public FctContext fct(int i) {
			return getRuleContext(FctContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(ScriptLanguageParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(ScriptLanguageParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(ScriptLanguageParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(ScriptLanguageParser.DIV, i);
		}
		public MulopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterMulop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitMulop(this);
		}
	}

	public final MulopContext mulop() throws RecognitionException {
		MulopContext _localctx = new MulopContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mulop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((MulopContext)_localctx).fstop = fct();
			 ((MulopContext)_localctx).value =  ((MulopContext)_localctx).fstop.value; 
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				setState(266);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MUL:
					{
					setState(258);
					match(MUL);
					setState(259);
					((MulopContext)_localctx).nxtop = fct();
					 ((MulopContext)_localctx).value =  new ast.Operator(ast.Operator.MUL, _localctx.value, ((MulopContext)_localctx).nxtop.value); 
					}
					break;
				case DIV:
					{
					setState(262);
					match(DIV);
					setState(263);
					((MulopContext)_localctx).nxtop2 = fct();
					 ((MulopContext)_localctx).value =  new ast.Operator(ast.Operator.DIV, _localctx.value, ((MulopContext)_localctx).nxtop2.value); 
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(270);
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

	public static class FctContext extends ParserRuleContext {
		public ast.Expression value;
		public Token NUMBER;
		public Token VARNAME;
		public ExpContext exp;
		public TerminalNode NUMBER() { return getToken(ScriptLanguageParser.NUMBER, 0); }
		public TerminalNode VARNAME() { return getToken(ScriptLanguageParser.VARNAME, 0); }
		public TerminalNode TIME() { return getToken(ScriptLanguageParser.TIME, 0); }
		public TerminalNode LPAR() { return getToken(ScriptLanguageParser.LPAR, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ScriptLanguageParser.RPAR, 0); }
		public TerminalNode ABS() { return getToken(ScriptLanguageParser.ABS, 0); }
		public FctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).enterFct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptLanguageListener ) ((ScriptLanguageListener)listener).exitFct(this);
		}
	}

	public final FctContext fct() throws RecognitionException {
		FctContext _localctx = new FctContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fct);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				((FctContext)_localctx).NUMBER = match(NUMBER);
				 ((FctContext)_localctx).value =  new ast.Const((((FctContext)_localctx).NUMBER!=null?((FctContext)_localctx).NUMBER.getText():null)); 
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				((FctContext)_localctx).VARNAME = match(VARNAME);
				 ((FctContext)_localctx).value =  new ast.Identifier((((FctContext)_localctx).VARNAME!=null?((FctContext)_localctx).VARNAME.getText():null)); 
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				match(TIME);
				 String time = Double.toString(System.currentTimeMillis()/1000); ((FctContext)_localctx).value =  new ast.Const(time);
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(277);
				match(LPAR);
				setState(278);
				((FctContext)_localctx).exp = exp();
				setState(279);
				match(RPAR);
				 ((FctContext)_localctx).value =  ((FctContext)_localctx).exp.value; 
				}
				break;
			case ABS:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				match(ABS);
				setState(283);
				match(LPAR);
				setState(284);
				((FctContext)_localctx).exp = exp();
				setState(285);
				match(RPAR);
				 ((FctContext)_localctx).value =  new ast.Abs(((FctContext)_localctx).exp.value);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\6\2\"\n\2\r\2\16\2"+
		"#\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\39\n\3\f\3\16\3<\13\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3D\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4U\n\4\3\5"+
		"\3\5\3\5\3\5\3\6\5\6\\\n\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\6\7j\n\7\r\7\16\7k\3\7\3\7\3\7\3\7\3\7\3\7\7\7t\n\7\f\7\16\7w\13"+
		"\7\5\7y\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0086\n\b"+
		"\r\b\16\b\u0087\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0090\n\b\f\b\16\b\u0093\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u00a5\n\t\f\t\16\t\u00a8\13\t\6\t\u00aa\n\t\r\t\16\t\u00ab\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\7\t\u00b5\n\t\f\t\16\t\u00b8\13\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00cb\n\n\f\n\16"+
		"\n\u00ce\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00da"+
		"\n\13\f\13\16\13\u00dd\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ef\n\f\f\f\16\f\u00f2\13\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00fe\n\r\f\r\16\r\u0101\13\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u010d\n\16\f\16\16\16"+
		"\u0110\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\5\17\u0123\n\17\3\17\2\2\20\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\2\3\3\2\6\7\2\u0135\2!\3\2\2\2\4C\3\2\2\2\6T\3\2"+
		"\2\2\bV\3\2\2\2\n[\3\2\2\2\fb\3\2\2\2\16|\3\2\2\2\20\u0096\3\2\2\2\22"+
		"\u00bd\3\2\2\2\24\u00d1\3\2\2\2\26\u00e0\3\2\2\2\30\u00f3\3\2\2\2\32\u0102"+
		"\3\2\2\2\34\u0122\3\2\2\2\36\37\5\4\3\2\37 \b\2\1\2 \"\3\2\2\2!\36\3\2"+
		"\2\2\"#\3\2\2\2#!\3\2\2\2#$\3\2\2\2$%\3\2\2\2%&\7\2\2\3&\3\3\2\2\2\'("+
		"\5\n\6\2()\7\22\2\2)*\b\3\1\2*D\3\2\2\2+,\5\b\5\2,-\7\22\2\2-.\b\3\1\2"+
		".D\3\2\2\2/\60\7\3\2\2\60\61\7\27\2\2\61\62\b\3\1\2\62\63\5\26\f\2\63"+
		":\b\3\1\2\64\65\7!\2\2\65\66\5\26\f\2\66\67\b\3\1\2\679\3\2\2\28\64\3"+
		"\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2\2=>\7\30\2\2>?"+
		"\7\22\2\2?D\3\2\2\2@A\5\6\4\2AB\b\3\1\2BD\3\2\2\2C\'\3\2\2\2C+\3\2\2\2"+
		"C/\3\2\2\2C@\3\2\2\2D\5\3\2\2\2EF\5\f\7\2FG\b\4\1\2GU\3\2\2\2HI\5\16\b"+
		"\2IJ\b\4\1\2JU\3\2\2\2KL\5\20\t\2LM\b\4\1\2MU\3\2\2\2NO\5\22\n\2OP\b\4"+
		"\1\2PU\3\2\2\2QR\5\24\13\2RS\b\4\1\2SU\3\2\2\2TE\3\2\2\2TH\3\2\2\2TK\3"+
		"\2\2\2TN\3\2\2\2TQ\3\2\2\2U\7\3\2\2\2VW\t\2\2\2WX\7\"\2\2XY\b\5\1\2Y\t"+
		"\3\2\2\2Z\\\t\2\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\"\2\2^_\7\34\2"+
		"\2_`\5\26\f\2`a\b\6\1\2a\13\3\2\2\2bc\7\f\2\2cd\5\26\f\2de\b\7\1\2ei\7"+
		"\31\2\2fg\5\4\3\2gh\b\7\1\2hj\3\2\2\2if\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl"+
		"\3\2\2\2lm\3\2\2\2mx\7\32\2\2no\7\16\2\2ou\7\31\2\2pq\5\4\3\2qr\b\7\1"+
		"\2rt\3\2\2\2sp\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vy\3\2\2\2wu\3\2\2"+
		"\2xn\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\32\2\2{\r\3\2\2\2|}\7\27\2\2}~\5"+
		"\26\f\2~\177\b\b\1\2\177\u0080\7\30\2\2\u0080\u0081\7\33\2\2\u0081\u0085"+
		"\7\27\2\2\u0082\u0083\5\4\3\2\u0083\u0084\b\b\1\2\u0084\u0086\3\2\2\2"+
		"\u0085\u0082\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\30\2\2\u008a\u008b\7 \2\2\u008b"+
		"\u0091\7\27\2\2\u008c\u008d\5\4\3\2\u008d\u008e\b\b\1\2\u008e\u0090\3"+
		"\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\30"+
		"\2\2\u0095\17\3\2\2\2\u0096\u0097\7\17\2\2\u0097\u0098\7\27\2\2\u0098"+
		"\u0099\7\"\2\2\u0099\u009a\b\t\1\2\u009a\u009b\7\30\2\2\u009b\u009c\7"+
		" \2\2\u009c\u00a9\7\31\2\2\u009d\u009e\7\20\2\2\u009e\u009f\5\34\17\2"+
		"\u009f\u00a0\b\t\1\2\u00a0\u00a6\7 \2\2\u00a1\u00a2\5\4\3\2\u00a2\u00a3"+
		"\b\t\1\2\u00a3\u00a5\3\2\2\2\u00a4\u00a1\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6"+
		"\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2"+
		"\2\2\u00a9\u009d\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\7\22"+
		"\2\2\u00af\u00b0\7\21\2\2\u00b0\u00b6\7 \2\2\u00b1\u00b2\5\4\3\2\u00b2"+
		"\u00b3\b\t\1\2\u00b3\u00b5\3\2\2\2\u00b4\u00b1\3\2\2\2\u00b5\u00b8\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00bc\7"+
		"\32\2\2\u00bc\21\3\2\2\2\u00bd\u00be\7\b\2\2\u00be\u00bf\7\27\2\2\u00bf"+
		"\u00c0\5\n\6\2\u00c0\u00c1\7\22\2\2\u00c1\u00c2\5\26\f\2\u00c2\u00c3\7"+
		"\22\2\2\u00c3\u00c4\5\n\6\2\u00c4\u00c5\b\n\1\2\u00c5\u00c6\7\30\2\2\u00c6"+
		"\u00cc\7\31\2\2\u00c7\u00c8\5\4\3\2\u00c8\u00c9\b\n\1\2\u00c9\u00cb\3"+
		"\2\2\2\u00ca\u00c7\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\32"+
		"\2\2\u00d0\23\3\2\2\2\u00d1\u00d2\7\t\2\2\u00d2\u00d3\5\26\f\2\u00d3\u00d4"+
		"\b\13\1\2\u00d4\u00d5\3\2\2\2\u00d5\u00db\7\31\2\2\u00d6\u00d7\5\4\3\2"+
		"\u00d7\u00d8\b\13\1\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00da\u00dd"+
		"\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00de\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00de\u00df\7\32\2\2\u00df\25\3\2\2\2\u00e0\u00e1\5\30"+
		"\r\2\u00e1\u00f0\b\f\1\2\u00e2\u00e3\7\35\2\2\u00e3\u00e4\5\30\r\2\u00e4"+
		"\u00e5\b\f\1\2\u00e5\u00ef\3\2\2\2\u00e6\u00e7\7\36\2\2\u00e7\u00e8\5"+
		"\30\r\2\u00e8\u00e9\b\f\1\2\u00e9\u00ef\3\2\2\2\u00ea\u00eb\7\37\2\2\u00eb"+
		"\u00ec\5\30\r\2\u00ec\u00ed\b\f\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00e2\3"+
		"\2\2\2\u00ee\u00e6\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\27\3\2\2\2\u00f2\u00f0\3\2\2"+
		"\2\u00f3\u00f4\5\32\16\2\u00f4\u00ff\b\r\1\2\u00f5\u00f6\7\23\2\2\u00f6"+
		"\u00f7\5\32\16\2\u00f7\u00f8\b\r\1\2\u00f8\u00fe\3\2\2\2\u00f9\u00fa\7"+
		"\24\2\2\u00fa\u00fb\5\32\16\2\u00fb\u00fc\b\r\1\2\u00fc\u00fe\3\2\2\2"+
		"\u00fd\u00f5\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\31\3\2\2\2\u0101\u00ff\3\2\2\2\u0102"+
		"\u0103\5\34\17\2\u0103\u010e\b\16\1\2\u0104\u0105\7\25\2\2\u0105\u0106"+
		"\5\34\17\2\u0106\u0107\b\16\1\2\u0107\u010d\3\2\2\2\u0108\u0109\7\26\2"+
		"\2\u0109\u010a\5\34\17\2\u010a\u010b\b\16\1\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0104\3\2\2\2\u010c\u0108\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\33\3\2\2\2\u0110\u010e\3\2\2\2\u0111\u0112"+
		"\7#\2\2\u0112\u0123\b\17\1\2\u0113\u0114\7\"\2\2\u0114\u0123\b\17\1\2"+
		"\u0115\u0116\7\5\2\2\u0116\u0123\b\17\1\2\u0117\u0118\7\27\2\2\u0118\u0119"+
		"\5\26\f\2\u0119\u011a\7\30\2\2\u011a\u011b\b\17\1\2\u011b\u0123\3\2\2"+
		"\2\u011c\u011d\7\4\2\2\u011d\u011e\7\27\2\2\u011e\u011f\5\26\f\2\u011f"+
		"\u0120\7\30\2\2\u0120\u0121\b\17\1\2\u0121\u0123\3\2\2\2\u0122\u0111\3"+
		"\2\2\2\u0122\u0113\3\2\2\2\u0122\u0115\3\2\2\2\u0122\u0117\3\2\2\2\u0122"+
		"\u011c\3\2\2\2\u0123\35\3\2\2\2\30#:CT[kux\u0087\u0091\u00a6\u00ab\u00b6"+
		"\u00cc\u00db\u00ee\u00f0\u00fd\u00ff\u010c\u010e\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}