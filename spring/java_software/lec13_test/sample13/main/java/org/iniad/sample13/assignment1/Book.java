package java_software.lec13_test.sample13.main.java.org.iniad.sample13.assignment1;

public class Book extends Item {
    public Book(String name, int price) {
        super(name, price);
    }

    public int getTaxPrice() {
        return (int)(price * 1.1);
    }
}
