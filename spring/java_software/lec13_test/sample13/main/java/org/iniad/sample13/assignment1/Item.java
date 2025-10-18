package java_software.lec13_test.sample13.main.java.org.iniad.sample13.assignment1;

abstract public class Item {
    private String name;
    protected int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    abstract public int getTaxPrice();
}
