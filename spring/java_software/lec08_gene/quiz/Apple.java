package quiz;

public class Apple extends Fruit implements Sellable {
    private static final String COLOR = "Red";
    private int price;

    public Apple(double weight, int price) {
        super(weight);
        this.price = price;
    }

    @Override
    public String getColor() {
        return COLOR;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
