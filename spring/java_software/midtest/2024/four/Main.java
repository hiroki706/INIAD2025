package four;

public class Main {
    public static void main(String[] args) {
        Smartphone sp = new Smartphone("Apple", 100, 3);
        System.out.println(sp.getManufacturer());
        System.out.println(sp.getBatteryLevel());
        System.out.println(sp.getAppCount());
        sp.openApp();
        System.out.println(sp.getAppCount());
        sp.closeApp();
        System.out.println(sp.getAppCount());
    }
}
