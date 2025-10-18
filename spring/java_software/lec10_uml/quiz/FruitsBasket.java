package quiz;

import java.util.List;

public class FruitsBasket {
    List<Fruit> fruits;

    public FruitsBasket() {
        fruits = new java.util.ArrayList<>();
    }

    void add(Fruit fruit) {
        fruits.add(fruit);
    }

    void print() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit.getColor());
        }
    }
}
