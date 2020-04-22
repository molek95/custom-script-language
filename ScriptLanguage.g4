grammar ScriptLanguage;

@members {
    private java.util.Map<String,Double> ids = new java.util.TreeMap<String,Double>();
    
    public static void main(String[] args) throws Exception {
        ScriptLanguageLexer lex = new ScriptLanguageLexer(new ANTLRFileStream(args[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        ScriptLanguageParser parser = new ScriptLanguageParser(tokens);
        parser.program();
    }
}

program
	@init{ ast.Program p = new ast.Program(); }
	@after{ p.evaluate(); }
	: ( command { p.addExpression($command.value); } )+ EOF
;

command returns [ast.Expression value]: 
	fstop = assignment SEMICOLON     {$value = $fstop.value;}
	| nxtop = declaration SEMICOLON  {$value = $nxtop.value;}
	| PRINT LPAR {$value = new ast.Print();}
            nxtop2=exp                        {((ast.Print)$value).addExpression($nxtop2.value);}
            (COMMA nxtop3=exp {((ast.Print)$value).addExpression($nxtop3.value);} )*
            RPAR SEMICOLON
        | controlStructures     {$value = $controlStructures.value;}
;

controlStructures returns [ast.Expression value]: 
	ifStatement         {$value = $ifStatement.value;}
	|shortIfStatement    {$value = $shortIfStatement.value;}
	|switchCaseStatement    {$value = $switchCaseStatement.value;}
	|forLoop            {$value = $forLoop.value;}
	|whileLoop          {$value = $whileLoop.value;}
;

declaration returns [ast.Expression value]: 
	(INT | DOUBLE) VARNAME		{ $value = new ast.Assignment(new ast.Identifier($VARNAME.text)); }
;

assignment returns [ast.Expression value]: 
	(INT | DOUBLE)? VARNAME ASSIGN exp 	{ $value = new ast.Assignment(new ast.Identifier($VARNAME.text), $exp.value); }
;

ifStatement returns [ast.Expression value]: 
	IF fstop=exp {$value=new ast.If($fstop.value);} 
            LBRACE (nxtop=command {((ast.If)$value).addDoExpression($nxtop.value);} )+ RBRACE
            (ELSE LBRACE (nxtop2=command {((ast.If)$value).addElseExpression($nxtop2.value);} )*)? RBRACE
;

shortIfStatement returns [ast.Expression value]: 
	LPAR fstop=exp {$value=new ast.If($fstop.value);} RPAR
            KERDOJEL LPAR (nxtop=command {((ast.If)$value).addDoExpression($nxtop.value);} )+ RPAR
            COLON LPAR (nxtop2=command {((ast.If)$value).addElseExpression($nxtop2.value);} )* RPAR
;

switchCaseStatement returns [ast.Expression value]:
    SWITCH LPAR VARNAME { $value=new ast.SwitchCase($VARNAME.text);} RPAR COLON LBRACE
        (CASE fstop=fct {((ast.SwitchCase)$value).addCase($fstop.value);} COLON
            (nxtop=command {((ast.SwitchCase)$value).addDoExpression($fstop.value, $nxtop.value);})*
        )+
            BREAK SEMICOLON
        (DEFAULT COLON
            (nxtop2=command {((ast.SwitchCase)$value).addElseExpression($nxtop2.value);})*
        )
            BREAK SEMICOLON
RBRACE
;

forLoop returns [ast.Expression value]:
    FOR LPAR fstop = assignment SEMICOLON    
             nextop = exp SEMICOLON     
             nextop2 = assignment     {$value = new ast.For($fstop.value, $nextop.value, $nextop2.value);}  RPAR
             LBRACE (nextop3=command {((ast.For)$value).addExpression($nextop3.value); })* RBRACE
;

whileLoop returns [ast.Expression value]:
	WHILE (fstop=exp {$value = new ast.While($fstop.value);}) LBRACE 
            (nextop=command {((ast.While)$value).addExpression($nextop.value);})* 
        RBRACE
;

exp returns [ast.Expression value]:
	fstop = addop 		{ $value = $fstop.value; } 
    (  '==' nxtop=addop 		{ $value = new ast.Operator(ast.Operator.EQ, $value, $nxtop.value); }
     | '<' nxtop2=addop 		{ $value = new ast.Operator(ast.Operator.LT, $value, $nxtop2.value); }
     | '>' nxtop3=addop 		{ $value = new ast.Operator(ast.Operator.GT, $value, $nxtop3.value); }
    )*
;

addop returns [ast.Expression value]: 
	fstop = mulop 		{ $value = $fstop.value; } 
	(ADD nxtop = mulop 		{ $value = new ast.Operator(ast.Operator.ADD, $value, $nxtop.value); }
	|SUB nxtop2 = mulop 	{ $value = new ast.Operator(ast.Operator.SUB, $value, $nxtop2.value); }
	)*
;

mulop returns [ast.Expression value]: 
	fstop = fct 			{ $value = $fstop.value; }
	(MUL nxtop = fct 	{ $value = new ast.Operator(ast.Operator.MUL, $value, $nxtop.value); }
	|DIV nxtop2 = fct	{ $value = new ast.Operator(ast.Operator.DIV, $value, $nxtop2.value); }
	)*
;

fct returns [ast.Expression value]:
	NUMBER 		{ $value = new ast.Const($NUMBER.text); }
	| VARNAME	{ $value = new ast.Identifier($VARNAME.text); }
	| TIME		{ String time = Double.toString(System.currentTimeMillis()/1000); $value = new ast.Const(time);}
	| LPAR exp RPAR 		{ $value = $exp.value; }
	| ABS LPAR exp RPAR	{ $value = new ast.Abs($exp.value);}
        
;

PRINT	: 'print';
ABS	: 'ABS';
TIME	: 'TIME';
INT	: 'int';
DOUBLE	: 'double';
FOR	: 'for';
WHILE	: 'while';
BREAK	: 'break';
CONTINUE: 'continue';
IF	: 'if';
THEN	: 'then';
ELSE	: 'else';
SWITCH	: 'switch';
CASE	: 'case';
DEFAULT	: 'default';
SEMICOLON: ';';
ADD	: '+';
SUB	: '-';
MUL	: '*';
DIV	: '/';
LPAR	: '(';
RPAR	: ')';
LBRACE   : '{';
RBRACE    : '}';
KERDOJEL: '?';
ASSIGN	: '=';
EQUALS	: '==';
LESSTHEN	: '<';
GREATERTHEN	: '>';
COLON: ':';
COMMA: ',';
VARNAME	: ('a'..'z')('0'..'9' | 'a'..'z')*;
NUMBER	: ('0'..'9')+ ('.' '0'..'9'+)?;
WHITESPACE  : (' '|'\t'|'\r'|'\n')  ->skip;
NEWLINE	: '\r'? '\n' -> skip;