package assignment4;

abstract public class Product {
    protected String name;
    protected double price;

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

    abstract public double getTaxIncludedPrice();
}
