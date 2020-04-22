package ast;

public class Assignment extends Expression {
    private Identifier id;
    private Expression exp;

    public Assignment(Identifier id) {
        this.id = id;
        this.exp = new Const("0");
    }

    public Assignment(Identifier id, Expression exp) {
        this.id = id;
        this.exp = exp;
    }

    public double evaluate() {
        double value = exp.evaluate();
        Program.ids.put(id.getName(), value);
        return value;
    }
}