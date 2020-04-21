grammar ScriptLanguage;

options {
    language = Java;
}

@members {
    private java.util.Map<String, Double> ids = new java.util.TreeMap<String, Double>(); 

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
    : ( command {  p.addExpression($command.value);}  )+ EOF
;

command returns [ast.Expression value]:
    l1 = assignment SEMICOLON {$value = $l1.value;}
    | e1 = declaration SEMICOLON {$value = $e1.value;}
    | PRINT LPAR {$value = new ast.Print(); }
        exp1 = exp {((ast.Print)$value).addExpression($exp1.value);}
        (COMMA exp2 = exp {((ast.Print)$value).addExpression($exp2.ertek); })*
        RPAR SEMICOLON
    | controlStructures {$value = $controlStructures.value;}
;

controlStructures returns [ ast.Expression value ]:
    if {$value = $if.value;}
    | shortIf {$value = $shortIf.value;}
    | switchCase {$value = $switch.value;}
    | for {$value = $for.value;}
    | while {$value = $while.value;}
;

if returns [ast.Expression value]:
    IF fstop=exp {$value = new ast.If($fstop.value);}
        LBRACE (nxtop=fct {((ast.If)$value).doExpression($nxtop.value);})+ RBRACE
        (ELSE LBRACE (nxtop2=fct {((ast.If)$value).elseExpression($nxtop2.value);})*)? RBRACE
;

shortIf returns [ast.Expression value]:
    LPAR fstop=exp {$value = new ast.If($fstop.vaue);}
        LBRACE (nxtop=fct {((ast.If)$value).doExpression($nxtop.value);})+ RBRACE
        (ELSE LBRACE (nxtop2=fct {((ast.If)$value).elseExpression($nxtop2.value);})*)? RBRACE
;

switchCase returns [ast.Expression value]:
    SWITCH LPAR VARNAME { $value=new ast.SwitchCase($VARNAME.text); } RPAR SEMICOLON LBRACE
    (CASE fstop=fct {((ast.SwitchCase)$value).addCase($fstop.value);} SEMICOLON
        (nxtop=command {((ast.SwitchCase)$value).doExpression($fstop.value, $nxtop.value);})*
    )+
    BREAK SEMICOLON
    (DEFAULT SEMICOLON
        (nxtop2=command {((ast.SwitchCase)$value).elseExpression($nxtop);})*
    )
    BREAK SEMICOLON RBRACE
;

for returns [ast.Expression value]:
    FOR LPAR fstop=assignment SEMICOLON 
        nxtop=exp SEMICOLON 
        nxtop2=assignment {$value=new ast.For($fstop.value, $nxtop.value, $nxtop2.value);} RBRACE
        LBRACE (nxtop3=command {((ast.For)$value).addExpression($nxtop3.value);})* RBRACE
;

while returns [ast Expression value]:
    WHILE (fstop=exp {$value = new ast.While($fstop.value);}) LBRACE
        (nxtop=command {((ast.While)$value).addExpression($nxtop.value);})*
    RBRACE
;

declaration returns [ast.Expression value]:
    (INT | DOUBLE) VARNAME {$value = new ast.Assignment(new ast.Identifier($VARNAME.text)); }
;

assignment returns [ast.Expression value]:
    (INT | DOUBLE)? VARNAME ASSIGN exp {$value = new ast.Assignment(new ast.Identifier($VARNAME.text), $exp.value); }
;

exp returns [ast.Expression value]:
    fstop=addop { $value = $fstop.value; }
    ( '==' nxtop=addop {$value = new ast.Operator(ast.Operator.EQUALS, $value, $nxtop.value);} 
     | '<' nxtop2=addop {$value = new ast.Operator(ast.Operator.LESSTHEN, $value, $nxtop2.value);}
     | '>' nxtop3=addop {$value = new ast.Operator(ast.Operator.GREATERTHEN, $value, $nxtop3.value);}
    )*
;

addop returns [ast.Expression value]:
    fstop=mulop { $value = $fstop.value; }
    (ADD nxtop=fct { $value = new ast.Operator(ast.Operator.ADD, $value, $nxtop.value); }
     |SUB nxtop2=fct { $value = new ast.Operator(ast.Operator.SUB, $value, $nxtop2.value); }
    )*
;

mulop returns [ast.Expression value]:
    fstop=fct { $value = $fstop.value; }
    (MUL nxtop=fct { $value = new ast.Operator(ast.Operator.MUL, $value, $nxtop.value); }
     |DIV nxtop2=fct { $value = new ast.Operator(ast.Operator.DIV, $value, $nxtop2.value); }
    )*
;

fct returns [ast.Expression value]:
    NUMBER { $value = new ast.Const($NUMBER.text); }
    | VARNAME { $value = new ast.Identifier($VARNAME.text); }
    | TIME { String time = Double.toString(System.currentTimeMillis()/1000); $value = new ast.Const(time); }
    | LPAR exp RPAR { $value = $exp.value; }
    | ABS LPAR exp RPAR { $value = new ast.Abs($exp.value); }
;

PRINT: 'print';
ABS: 'abs';
TIME: 'TIME';
INT: 'int';
DOUBLE: 'double';
FOR: 'for';
WHILE: 'while';
BREAK: 'break';
CONTINUE: 'continue';
IF: 'if';
THEN: 'then';
ELSE: 'else';
SWITCH: 'switch';
CASE: 'case';
DEFAULT: 'default';
SEMICOLON: ';';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
LPAR: '(' ;
RPAR: ')' ;
LBRACE: '{';
RBRACE: '}';
QUESTIONMARK: '?';
ASSIGN: '=';
EQUALS: '==';
LESSTHEN: '<';
GREATERTHEN: '>';
COLON: ':';
COMMA: ',';
VARNAME: ('a'..'z')('0'..'9' | 'a'..'z')*;
NUMBER: ('0'..'9')+ ('.' '0'..'9'+)?; 
WHITESPACE: (' '|'\t'|'\r'|'\n')  ->skip;
NEWLINE: '\r'? '\n' -> skip;