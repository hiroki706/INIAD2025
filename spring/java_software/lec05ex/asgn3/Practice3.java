package asgn3;

public class Practice3 {
    public static void main(String[] args) {
        Librarian librarian = new Librarian(30, "Bob", "INIAD library");
        Visitor visitor = new Visitor(20, "Alice", "123456");

        System.out.println(librarian.introduce());
        System.out.println(visitor.introduce());

        librarian.showLibraryNumber(visitor);
    }
}
