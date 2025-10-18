package atnd;

public class Main {
    public static void main(String[] args) {
        CarRecord car1 = new CarRecord("Model S", "Tesla");
        CarRecord car2 = new CarRecord("3 Series", "BMW");

        System.out.println(car1.getCarDetails());
        System.out.println(car2.getCarDetails());
    }
}
