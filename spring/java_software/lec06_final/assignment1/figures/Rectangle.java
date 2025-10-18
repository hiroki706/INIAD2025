package assignment1.figures;

import assignment1.base.Figure;

public class Rectangle extends Figure {
    final int width;

    public Rectangle(int width, int height) {
        super(height);
        this.width = width;
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
                System.out.print("*".repeat(width));
            System.out.println();
        }
    }
}
