package ast;

import java.util.List;
import java.util.ArrayList;

public class If extends Expression {

    private Expression boolExp;
    private List<Expression> doExp = new ArrayList<Expression>();
    private List<Expression> elseExp = new ArrayList<Expression>();

    public If(Expression boolnExp) {
        this.boolExp = boolExp;
    }

    public addDoExpression(Expression exp) {
        doExp.add(exp);
    }

    public addElseExpression(Expression exp) {
        elseExp.add(exp);
    }

    public double evaluate() {
        if (boolExp.evaluate() != 0) {
            for (Expression exp : doExp) {
                exp.evaluate();
            }
        } else {
            for (Expression exp : elseExp) {
                exp.evaluate();
            }
        }
        return 0;
    }
}