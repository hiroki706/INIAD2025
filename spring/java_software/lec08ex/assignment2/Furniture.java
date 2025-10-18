package assignment2;

public class Furniture extends Product {
    private int warrantyPeriod;

    public Furniture(String name, double price, int warrantyPeriod) {
        super(name, price);
        this.warrantyPeriod = warrantyPeriod;
    }

    @Override
    void showInfo() {
        System.out.printf(
            "Furniture={name=%s, price=%.2f, warrantyPeriod=%d}\n",
            getName(), getPrice(), warrantyPeriod
        );
    }
}
