package java_software.lec13_test.sample13.main.java.org.iniad.sample13.sample3;

public class Customer extends User {
    public Customer(String name) {
        super(name);
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public String getName() {
        return name;
    }
}
