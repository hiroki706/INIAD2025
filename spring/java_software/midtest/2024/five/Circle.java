package five;

public class Circle extends Shape implements Resizable {
    private double size;
    public Circle(String name, double size) {
        super(name);
        this.size = size;
    }

    @Override
    public String explain() {
        return String.format("This is a %s with radius %.1f", this.name, this.size);
    }

    public void setSize(double size) {
        this.size = size;
    }
    public double getSize() {
        return size;
    }
}
