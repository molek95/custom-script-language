package ast;

public class Identifier extends Expression {
    private String name;

    public Identifier(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double evaluate() {
        return Program.ids.get(name);
    }
}