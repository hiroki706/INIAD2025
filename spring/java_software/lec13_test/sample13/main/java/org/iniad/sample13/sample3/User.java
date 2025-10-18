package java_software.lec13_test.sample13.main.java.org.iniad.sample13.sample3;

abstract public class User {
    protected String name;
    protected int balance = 0;

    public User(String name) {
        this.name = name;
    }

    public void charge(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    abstract public String getName();
}
