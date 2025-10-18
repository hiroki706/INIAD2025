package sample14.thread2;

public class SingletonCounter {
    private static SingletonCounter instance = new SingletonCounter();
    private int count = 0;

    private SingletonCounter(){
    }

    public static SingletonCounter getInstance() {
        return instance;
    }
    
    public void increase() {
        count++;
    }

    public void decrease() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
