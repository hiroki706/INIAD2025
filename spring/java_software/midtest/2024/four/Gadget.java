package four;

public class Gadget {
    protected final String manufacturer;
    protected double batteryLevel;

    public Gadget(String manufacturer, double batteryLevel) {
        this.manufacturer = manufacturer;
        this.batteryLevel = batteryLevel;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public double getBatteryLevel() {
        return this.batteryLevel;
    }
}
