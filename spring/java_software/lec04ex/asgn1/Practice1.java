package asgn1;

public class Practice1 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "green", 5, 10);
        Circle circle2 = new Circle(3.0, "yellow", -3, 5);

        System.out.println("Circle1の面積: " + circle1.getArea());
        System.out.println("Circle2の円周: " + circle2.getCircumference());
        System.out.println("Circle1とCircle2の距離: " + circle1.getDistance(circle2));
    }
    }
