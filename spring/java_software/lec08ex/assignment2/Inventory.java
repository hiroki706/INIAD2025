package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Product> {
    private List<T> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public T getProduct(int index) {
        if (index < 0 || index >= products.size()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + products.size());
        }
        return products.get(index);
    }
    public int getCount() {
        return products.size();
    }
}
