package assignment1.figures;

import assignment1.base.Figure;

public class Pyramid extends Figure {

    public Pyramid(int height) {
        super(height);
    }

    @Override
    public void draw() {
        for (int i = 0; i < height; i++) {
            System.out.print(" ".repeat(height - i - 1));
            System.out.print("*".repeat(2 * i + 1));
            System.out.println();
        }
    }
}
