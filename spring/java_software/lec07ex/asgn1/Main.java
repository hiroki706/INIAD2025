package asgn1;

public class Main {
    public static void main(String[] args) {
        Function factorial = new Factorial();
        double result = factorial.evaluate(10);
        System.out.println("Factorial of 10 is: " + result);
    }
}
