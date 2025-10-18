package asgn2;

public class Practice2 {
    public static void main(String[] args) {

        Author author = new Author("Alice", "alice@example.com");
        Book book = new Book("Dummy Book", author, 5000);
        System.out.println("Book Title: " + book.getName());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Price: " + book.getPrice());
        book.setPrice(5500);
        author.setEmail("alice2@example.com");
        System.out.println("Book Title: " + book.getName());
        System.out.println("Book Author: " + book.getAuthor());
        System.out.println("Book Price: " + book.getPrice());
    }
}
