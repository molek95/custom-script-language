package ast;

import java.util.List;
import java.util.ArrayList;

public class For extends Expression {

    private Expression startCondition;
    private Expression boolExp;
    private Expression changeExp;
    private List<Expression> doExp = new ArrayList<Expression>();

    public For(Expression startCondition, Expression boolExp, Expression changeExp) {
        this.startCondition = startCondition;
        this.boolExp = boolExp;
        this.changeExp = changeExp;
    }

    public void addExpression(Expression exp) {
        doExp.add(exp);
    }

    public double evaluate() {
        startCondition.evaluate();
        while(boolExp.evaluate() != 0) {
            for(Expression exp : doExp) {
                exp.evaluate();
            }
            changeExp.evaluate();
        }
        return 0;
    }
}