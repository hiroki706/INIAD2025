package asgn2;

public class TestOrange {
    public static void main(String[] args) {
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        orange1.peel();
        System.out.println("Orange 1: " + orange1.getState());
        System.out.println("Orange 2: " + orange2.getState());
    }
}
