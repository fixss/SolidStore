package src.main.java;

import java.util.Map;
import java.util.HashMap;

//Liskov substitution principle, requires the objects of your subclasses to behave in the same way as the objects of your superclass.
public class Grocery implements Product {
    protected String product;
    protected int price;
    protected int countProducts;

    protected Map<String, Integer> products;

    public Grocery() {
        this.product = product;
        this.price = price;
        this.products = new HashMap<>();
    }

    public void printProducts() {
        for (Map.Entry<String, Integer> productAndPrice : products.entrySet()) {
            System.out.println(productAndPrice.getKey() + " for " + productAndPrice.getValue() + " rub./PCS.");
        }
    }

    @Override
    public void addProduct(String product, int price) {
        products.put(product, price);
        countProducts++;
    }
}