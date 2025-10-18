package assignment2;

public class Vegetables extends Product {
    private String expirationDate;

    public Vegetables(String name, double price, String expirationDate) {
        super(name, price);
        this.expirationDate = expirationDate;
    }

    @Override
    void showInfo() {
        System.out.printf(
            "Vegetables={name='%s', price=%.2f, expiration='%s'}\n",
            getName(), getPrice(), expirationDate
        );
    }
}
