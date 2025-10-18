package asgn2;

public class Fruit {
    public String state = "skined";

    public void peel() {
        this.state = "peeled";
    }

    public String getState() {
        return this.state;
    }
}
