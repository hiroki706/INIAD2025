package sample11.observer4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        SensorReader sr = new SensorReader("s1F102301011","Korean-pro");
        SensorObserver so = new SensorObserver();
        sr.addObserver(so);
        sr.execute("3205");
    }
}
