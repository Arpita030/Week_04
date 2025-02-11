package smart_warehouse_management_system;

import java.util.List;

public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<WarehouseItem> storage=new Storage<>();
        storage.addItem(new Electronics("Washing Machine",50000));
        storage.addItem(new Furniture("sofa set",5000));
        storage.addItem(new Groceries("cashew nuts",150));
        displayItems(storage.getItems());
    }

    public static void displayItems(List<? extends WarehouseItem> items){
        System.out.println("------Warehouse Item details:------\n");
        for(WarehouseItem item: items){
            System.out.println("Name   :" + item.getName());
            System.out.println("Price  :" + item.getPrice() + "$\n");
        }
    }
}
