ANTLR := antlr-4.8-complete.jar
PNAME1 := ScriptLanguage
SRC1 := $(PNAME1).g4
GENP1 := $(PNAME1)Parser
GENJ1 := $(PNAME1)BaseListener.java $(PNAME1)Lexer.java $(PNAME1)Listener.java $(GENP1).java
GENS1 := $(PNAME1).interp $(PNAME1).tokens $(PNAME1)Lexer.interp $(PNAME1)Lexer.tokens
AST := Abs Assignment Const Expression For Identifier If Operator Print Program SwitchCase While
ASTSRC := $(patsubst %,ast/%.java,$(AST))
ASTCLS := $(patsubst %,ast/%.class,$(AST))
INPUT := input.txt

run1: $(GENP1).class $(ASTCLS) $(INPUT)
	java -cp .:$(ANTLR) $(GENP1) $(INPUT)


$(ASTCLS): %.class: %.java
	javac $<

$(GENP1).class: %.class: %.java
	javac -cp .:$(ANTLR) $<

$(GENP1).java: $(SRC1)
	java -jar $(ANTLR) $<


clean:
	rm -rf $(GENJ1) $(GENS1) *.class ast/*.class

.PHONY: clean
