package ast;

import java.util.List;
import java.util.ArrayList;

public class Program {

    static java.util.Map<String,Double> ids;
    private List<Expression> list;


    public Program() {
        list = new ArrayList<Expression>();
    }

    public void addExpression(Expression asgmt){
        list.add(asgmt);
    }

    public void evaluate() {
        ids = new java.util.TreeMap<String,Double>();
        for (Expression asgmt : list) {
            asgmt.evaluate();
        }
    }
}