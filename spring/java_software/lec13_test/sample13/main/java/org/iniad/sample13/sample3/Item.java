package java_software.lec13_test.sample13.main.java.org.iniad.sample13.sample3;

public class Item {
    private Seller seller;
    private String name;
    private int price;

    public Item(Seller seller, String name, int price) {
        this.seller = seller;
        this.name = name;
        this.price = price;
    }

    public Seller getSeller() {
        return seller;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
