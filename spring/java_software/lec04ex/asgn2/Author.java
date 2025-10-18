package asgn2;

public class Author {
    String name;
    String email;

    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String toString() {
        return String.format("Author [name=%s, email=%s]", this.name, this.email);
    }
}
