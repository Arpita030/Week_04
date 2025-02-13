package shopping_cart;

import implement_a_shopping_cart.ProductManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductManagerTest {
    private ProductManager manager;
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        manager = new ProductManager();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    void testDisplayProductOrder() {
        manager.addProduct("Laptop", 1000.0);
        manager.addProduct("Phone", 800.0);
        manager.addProduct("Tablet", 500.0);
        manager.addProduct("Headphones", 200.0);

        manager.displayProductOrder();

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Laptop - $1000.0"));
        assertTrue(output.contains("Phone - $800.0"));
        assertTrue(output.contains("Tablet - $500.0"));
        assertTrue(output.contains("Headphones - $200.0"));
    }

    @Test
    void testDisplaySortedProducts() {
        manager.addProduct("Laptop", 1000.0);
        manager.addProduct("Phone", 800.0);
        manager.addProduct("Tablet", 500.0);
        manager.addProduct("Headphones", 200.0);

        manager.displaySortedProducts();

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Headphones - $200.0"));
        assertTrue(output.contains("Tablet - $500.0"));
        assertTrue(output.contains("Phone - $800.0"));
        assertTrue(output.contains("Laptop - $1000.0"));
    }
}
