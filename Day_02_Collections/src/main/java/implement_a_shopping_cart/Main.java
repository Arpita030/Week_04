package implement_a_shopping_cart;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();

        manager.addProduct("Laptop", 1000.0);
        manager.addProduct("Phone", 800.0);
        manager.addProduct("Tablet", 500.0);
        manager.addProduct("Headphones", 200.0);

        manager.displayProductOrder();

        manager.displaySortedProducts();
    }
}
