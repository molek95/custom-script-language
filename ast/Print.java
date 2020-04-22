package ast;

import java.util.List;
import java.util.ArrayList;

public class Print extends Expression {

    private List<Expression> expList = new ArrayList<Expression>();

    public Print() {}

    public void addExpression(Expression exp) {
        this.expList.add(exp);
    }

    public double evaluate() {
        for (Expression exp : expList) {
            if (exp.evaluate() % 1 == 0) {
                Double d = exp.evaluate();
                System.out.println(d.intValue());
            } else {
                System.out.println(exp.evaluate());
            }
        }
        return 0;
    }
}