package assignment4;

public class Electronics extends Product {
    private double tax = 0.1;

    public Electronics(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getTaxIncludedPrice() {
        return price + (price * tax);
    }
}
