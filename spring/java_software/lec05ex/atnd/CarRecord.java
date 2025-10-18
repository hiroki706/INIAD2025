package atnd;

public class CarRecord {
    static int i = 1;

    private final String model, manufacturer;
    private final int id;

    public CarRecord(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.id = i++;
    }

    public String getCarDetails() {
        return String.format("ID: %d - Manufacturer: %s, Model: %s", id, manufacturer, model);
    }
}
