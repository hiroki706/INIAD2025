package asgn1;

public class Factorial implements Function {
    @Override
    public double evaluate(double x) {
        if (x == 0 || x == 1) {
            return 1;
        }  else {
            return x * new Factorial().evaluate(x - 1);
        }
    }
}
