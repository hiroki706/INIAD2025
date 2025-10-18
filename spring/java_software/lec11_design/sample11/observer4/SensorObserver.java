package sample11.observer4;

public class SensorObserver implements Observer {
    public SensorObserver() {
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
