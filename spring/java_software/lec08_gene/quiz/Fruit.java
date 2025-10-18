package quiz;

public abstract class Fruit {
    private double weight;

    public Fruit(double weight) {
        this.weight = weight;
    }

    public double getWeight(double weight) {
        return this.weight;
    }

    public abstract String getColor();
}
