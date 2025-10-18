package four;

public class Main {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.addObserver(new MyObserver());
        c.increment();
        c.increment();
        c.decrement();
    }
}
