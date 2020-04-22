package ast;

public class Operator extends Expression {

    public static final int ADD = 0;
    public static final int SUB = 1;
    public static final int MUL = 2;
    public static final int DIV = 3;
	public static final int EQ = 4;
	public static final int LT = 5;
	public static final int GT = 6;


    private int op;
    private Expression lExp;
    private Expression rExp;

    public Operator(int op, Expression l, Expression r) {
        this.op = op;
        this.lExp = l;
        this.rExp = r;
    }

    public double evaluate() {
        double lhs = lExp.evaluate();
        double rhs = rExp.evaluate();

        switch(op) {
            case ADD:
                return lhs + rhs;
            case SUB:
                return lhs - rhs;
            case MUL:
                return lhs * rhs;
            case DIV:
                return lhs / rhs;
            case EQ:
                return (lhs == rhs) ? 1 : 0;
            case LT:
                return (lhs < rhs) ? 1 : 0;
            case GT:
                return (lhs > rhs) ? 1 : 0;
            default:
                throw new RuntimeException("Operator " + op + " not found");
        }
    }
}