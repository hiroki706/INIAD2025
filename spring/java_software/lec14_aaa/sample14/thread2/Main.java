package sample14.thread2;

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        t1.start();
        t2.start();
    }
}