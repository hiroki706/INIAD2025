package assignment2;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    void showInfo() {
        System.out.printf("Product={name='%s', price=%.2f}\n", name, price);
    }
}
