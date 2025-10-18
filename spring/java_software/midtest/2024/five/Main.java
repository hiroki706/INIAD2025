package five;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle("Circle1", 5.0);
        System.out.println(c.explain());
        c.setSize(10.0);
        System.out.println(c.explain());
    }
}
