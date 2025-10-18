package four;

public class MyObserver implements Observer {
    public void update(Counter c) {
        System.out.printf("Counter:%d\n", c.getValue());
    }
}
