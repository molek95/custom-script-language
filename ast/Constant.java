package ast;

public class Constant extends Expression {
    private double value;

    public Constant(String value) {
        this.value = Double.parseDouble(value);
    }

    public double evaluate() {
        return value;
    }
}