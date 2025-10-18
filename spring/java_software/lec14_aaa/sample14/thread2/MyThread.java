package sample14.thread2;

public class MyThread extends Thread{
    private String name;
    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        SingletonCounter counter = SingletonCounter.getInstance();
        for(int i = 0; i < 1000; i++) {
            counter.increase();
        }
        System.out.printf("Thread %s count-up done: counter = %d\n", name, counter.getCount());
        
        try {
            sleep(10);
        } catch (InterruptedException e) {
            System.err.println("Interrupted!");
        }

        for(int i = 0; i < 1000; i++) {
            counter.decrease();
        }
        System.out.printf("Thread %s count-down done: counter = %d\n", name, counter.getCount());
    }
}
