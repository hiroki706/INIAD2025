package asgn3;

public class Librarian extends Person {
    private String libraryName;

    public Librarian( int age,String name, String libraryName) {
        super(name, age);
        this.libraryName = libraryName;
    }
    public void showLibraryNumber(Visitor visitor) {
        System.out.println(visitor.getName() + "の会員番号は" + visitor.getMembershipNumber() + "です。");
    }

}
