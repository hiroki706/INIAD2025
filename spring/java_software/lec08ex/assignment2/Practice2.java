package assignment2;

public class Practice2 {
    public static void main(String[] args) {
        Vegetables carrot = new Vegetables("Carrot", 200, "2024-06-10");
        Vegetables onion = new Vegetables("Onion", 200, "2024-06-05");

        Furniture desk = new Furniture("Desk", 5000, 12);
        Furniture chair = new Furniture("Chair", 2000, 24);

        Inventory<Vegetables> vegetableInventory = new Inventory<>();
        vegetableInventory.addProduct(carrot);
        vegetableInventory.addProduct(onion);
        Inventory<Furniture> furnitureInventory = new Inventory<>();
        furnitureInventory.addProduct(desk);
        furnitureInventory.addProduct(chair);

        System.out.println("Vegetable Inventory:" + vegetableInventory.getCount());
        for (int i = 0; i < vegetableInventory.getCount(); i++) {
            vegetableInventory.getProduct(i).showInfo();
        }
        System.out.println("Furniture Inventory:" + furnitureInventory.getCount());
        for (int i = 0; i < furnitureInventory.getCount(); i++) {
            furnitureInventory.getProduct(i).showInfo();
        }
    }
}
