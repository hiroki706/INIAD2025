package sample14.thread1;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread(10);
        MyThread t2 = new MyThread(5);
        t1.start();
        t2.start();
    }
}