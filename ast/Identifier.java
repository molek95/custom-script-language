package ast;

public class Identifier extends Expression {
    private String name;

    public Identifier(String name) {
        this.name = name;
    }

    public double evaluate() {
        return 0;
    }
}