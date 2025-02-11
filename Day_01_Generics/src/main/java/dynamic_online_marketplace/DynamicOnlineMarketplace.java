package dynamic_online_marketplace;

public class DynamicOnlineMarketplace {
    public static void main(String[] args) {
         Product<Category> products=new Product<>();
         products.addProduct(new Books("python", 100));
         products.addProduct(new Gadgets("wall clock",1500));
         products.addProduct(new Clothing("pants",120));
         products.displayProducts();
         products.applyDiscount(10);
    }
}
