package two;

public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("Notebook", 2, 500);
        Order o2 = new Order("Pencil", 5, 100);

        System.out.println("Order: " + o1.getItemName() + " x " + o1.getQuantity() + ", Total: " + o1.getTotalPrice());
        System.out.println("Order: " + o2.getItemName() + " x " + o2.getQuantity() + ", Total: " + o2.getTotalPrice());
        System.out.println("Grand total: " + Order.getGrandTotal());
    }
}
