package assignment2;

public class Cat extends Animal implements Barkable {
    public Cat() {
        super(null);
    }

    @Override
    public String bark() {
        return "Meow meow";
    }
}
