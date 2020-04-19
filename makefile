ANTLR := antlr-4.8-complete.jar
PNAME1 := Calculator
SRC1 := $(PNAME1).g4
GENP1 := $(PNAME1)Parser
GENJ1 := $(PNAME1)BaseListener.java $(PNAME1)Lexer.java $(PNAME1)Listener.java $(GENP1).java
GENS1 := $(PNAME1).interp $(PNAME1).tokens $(PNAME1)Lexer.interp $(PNAME1)Lexer.tokens
PNAME2 := CalculatorPFG
SRC2 := $(PNAME2).g4
GENP2 := $(PNAME2)Parser
GENJ2 := $(PNAME2)BaseListener.java $(PNAME2)Lexer.java $(PNAME2)Listener.java $(GENP2).java
GENS2 := $(PNAME2).interp $(PNAME2).tokens $(PNAME2)Lexer.interp $(PNAME2)Lexer.tokens
AST := Abs Add Const Div Expression Line Max Memory Min Mul Program Pwr SignM SignP Sub
ASTSRC := $(patsubst %,ast/%.java,$(AST))
ASTCLS := $(patsubst %,ast/%.class,$(AST))
INPUT := input.txt

run1: $(GENP1).class $(ASTCLS) $(INPUT)
	java -cp .:$(ANTLR) $(GENP1) $(INPUT)

run2: $(GENP2).class $(ASTCLS) $(INPUT)
	java -cp .:$(ANTLR) $(GENP2) $(INPUT)

gen1: $(GENP1).class $(ASTCLS) $(INPUT)
	java -cp .:$(ANTLR) $(GENP1) $(INPUT) --generate

gen2: $(GENP2).class $(ASTCLS) $(INPUT)
	java -cp .:$(ANTLR) $(GENP2) $(INPUT) --generate

$(ASTCLS): %.class: %.java
	javac $<

$(GENP1).class $(GENP2).class: %.class: %.java
	javac -cp .:$(ANTLR) $<

$(GENP1).java: $(SRC1)
	java -jar $(ANTLR) $<

$(GENP2).java: $(SRC2)
	java -jar $(ANTLR) $<

clean:
	rm -rf $(GENJ1) $(GENJ2) $(GENS1) $(GENS2) *.class ast/*.class

.PHONY: clean
