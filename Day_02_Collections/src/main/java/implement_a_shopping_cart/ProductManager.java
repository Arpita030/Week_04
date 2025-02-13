package implement_a_shopping_cart;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ProductManager {
    private Map<String,Double>productPrices=new HashMap<>();
    private LinkedHashMap<String, Double>productOrder=new LinkedHashMap<>();
    private TreeMap<Double, String>sortedProducts = new TreeMap<>();


    public void addProduct(String name, double price) {
        productPrices.put(name, price);
        productOrder.put(name, price);
        sortedProducts.put(price, name);
    }

    public void displayProductOrder() {
        System.out.println("Products in Insertion Order:");
        for (Map.Entry<String, Double> entry : productOrder.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
    }
    public void displaySortedProducts() {
        System.out.println("\nProducts Sorted by Price:");
        for (Map.Entry<Double, String> entry : sortedProducts.entrySet()) {
            System.out.println(entry.getValue() + " - $" + entry.getKey());
        }
    }

}
