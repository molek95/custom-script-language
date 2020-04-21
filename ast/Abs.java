package ast;

public class Abs extends Expression {
    private Expression exp;

    public Abs(Expression exp) {
        this.exp = exp;
    }

    public double evaluate() {
        return Math.abs(this.exp.evaluate());
    }
}