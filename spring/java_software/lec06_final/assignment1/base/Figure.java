package assignment1.base;

public class Figure {
    protected final int height;

    public Figure(int height) {
        this.height = height;
    }

    public void draw() {
        System.out.print("\n".repeat(height));
    }
}
