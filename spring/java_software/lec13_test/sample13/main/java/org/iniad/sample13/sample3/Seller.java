package java_software.lec13_test.sample13.main.java.org.iniad.sample13.sample3;

public class Seller extends User {
    private String shopName;

    public Seller(String name, String shopName) {
        super(name);
        this.shopName = shopName;
    }

    public void transfer(int amount) {
        balance += amount;
    }

    public String getName() {
        return String.format("%s(%s)", shopName, name);
    }
}
