package quiz;

public class Machine {
    final protected String model;
    final protected int price;

    Machine(String model, int price) {
        this.model = model;
        this.price = price;
    }

    String getModel() {
        return model;
    }
    int getPrice() {
        return price;
    }
}
