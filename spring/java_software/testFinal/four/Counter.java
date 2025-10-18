package four;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private int value = 0;
    private List<Observer> observerList = new ArrayList<>();

    public Counter() {
    }

    public int getValue() {
        return value;
    }

    public void increment() {
        value++;
        observerList.stream().forEach(ob -> ob.update(this));
    }

    public void decrement() {
        value--;
        observerList.stream().forEach(ob -> ob.update(this));
    }

    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
}
