package quiz;

public final class AdvancedMachine extends Machine {
    private static int totalPrice = 0;

    AdvancedMachine(String name, int price) {
        super(name, price);
        totalPrice += price;
    }

    public static int getTotalPrice() {
        return totalPrice;
    }

    public int getPrice() {
        return (int)(super.getPrice() *1.1);
    }
}
