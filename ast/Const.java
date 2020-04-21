package ast;

public class Const extends Expression {
    private double value;

    public Const(String value) {
        this.value = Double.parseDouble(value);
    }

    public double evaluate() {
        return value;
    }
}