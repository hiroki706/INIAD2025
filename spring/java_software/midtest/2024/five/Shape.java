package five;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    abstract public String explain();
}
