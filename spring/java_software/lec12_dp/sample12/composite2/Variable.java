package sample12.composite2;

import java.util.Map;

public class Variable extends Expression {
    private String token;

    public Variable(String name) {
        this.token = name;
    }

    @Override
    public float eval(Map<String, Float> variables) {
        if (variables.containsKey(token)) {
            return variables.get(token);
        } else {
            throw new IllegalArgumentException("Variable " + token + " not found");
        }
    }

    @Override
    public void print() {
        System.out.print(token);
    }
}
