package four;

public final class Smartphone extends Gadget {
    public static final int MAX_APP_COUNT = 10;
    private int appCount;

    public Smartphone(String manufacturer, double batteryLevel, int appCount) {
        super(manufacturer, batteryLevel);
        this.appCount = appCount;
    }

    public int getAppCount() {
        return appCount;
    }


    public void openApp() {
        if (appCount < MAX_APP_COUNT) {
            appCount++;
        }
    }

    public void closeApp() {
        if (1 <= appCount) {
            appCount--;
        }
    }
}
