package assignment2;

public class Animal {
    protected String stomach;

    String getStomach() {
        return stomach;
    }

    void eat() {
        stomach = "full";
    }

    void run() {
        stomach = "hungry";
    }

    public Animal(String stomach) {
        this.stomach = stomach;
    }
}
