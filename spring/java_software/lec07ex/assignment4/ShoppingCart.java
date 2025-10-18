package assignment4;

import java.util.ArrayList;

public class ShoppingCart{
    private ArrayList<Product> items;
    double total;
    double totalWithTax;

    ShoppingCart() {
        items = new ArrayList<>();
        total = 0.0;
        totalWithTax = 0.0;
    }

    public void addItem(Product item) {
        System.out.println("+ " + item.getName());
        items.add(item);
        total += item.getPrice();
        totalWithTax += item.getTaxIncludedPrice();
    }
    public void removeItem(String item) {
        Product removeProduct =  items.stream().filter(p -> p.getName().equals(item)).findFirst().orElse(null);
        if (removeProduct != null) {
            items.remove(removeProduct);
            total -= removeProduct.getPrice();
            totalWithTax -= removeProduct.getTaxIncludedPrice();
            System.out.println("- " + removeProduct.getName());
        } else {
            throw new IllegalArgumentException("Item not found in the cart: " + item);
        }
    }
    public String getReceipt() {
        StringBuilder receipt = new StringBuilder("-----------Receipt---------\n");
        for(Product item : items) {
            receipt.append(item.getName())
                   .append(", Price(Tax Included):\t")
                   .append(String.format("%.2f", item.getTaxIncludedPrice()))
                   .append("\n");
        }
        receipt.append("Total: ")
               .append(String.format("\t%.2f\n", total))
               .append("Tax: ")
                .append(String.format("\t%.2f", totalWithTax - total))
               .append("\nTotal with Tax: ")
               .append(String.format("\t%.2f", totalWithTax));
        return receipt.toString();
    }

}
