package assignment4;

public class FreshFood extends Product {
    private double tax = 0.08;

    public FreshFood(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getTaxIncludedPrice() {
        return price + (price * tax);
    }
}
