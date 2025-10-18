package assignment2;

import assignment2.base.Figure;
import assignment2.figures.Pyramid;
import assignment2.figures.Rectangle;
import assignment2.figures.Square;

public class Main {
    public static void main(String[] args) {
        Pyramid p = new Pyramid(4);
        Rectangle r = new Rectangle(4, 6);
        Square s = new Square(10);
        System.out.println("---");
        p.draw();
        System.out.println("---");
        r.draw();
        System.out.println("---");
        s.draw();
    }
}
