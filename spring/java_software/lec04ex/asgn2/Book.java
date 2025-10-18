package asgn2;

public class Book {
    String name;
    Author author;
    int price;
    Book(String name, Author author) {
        this.name = name;
        this.author = author;
    }
    Book(String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author.toString();
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
