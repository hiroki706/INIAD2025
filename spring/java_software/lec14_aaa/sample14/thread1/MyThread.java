package sample14.thread1;

public class MyThread extends Thread{
    private int count;
    public MyThread(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i = 0; i < count; i++) {
            System.out.println(count - i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
    }
}
