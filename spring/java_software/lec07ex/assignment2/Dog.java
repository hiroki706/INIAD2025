package assignment2;

public class Dog extends Animal implements Barkable {

    public Dog() {
        super(null);
    }

    @Override
    public String bark() {
        return "Bowwow";
    }

}
