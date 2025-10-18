package two;
public class Order {
    private static int grandTotal = 0;

    private final String itemName;
    private final int quantity;
    private final int unitPrice;

    public Order(String itemName, int quantity, int unitPrice) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        Order.grandTotal += quantity * unitPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getTotalPrice() {
        return quantity * unitPrice;
    }

    public static int getGrandTotal() {
        return grandTotal;
    }
}
