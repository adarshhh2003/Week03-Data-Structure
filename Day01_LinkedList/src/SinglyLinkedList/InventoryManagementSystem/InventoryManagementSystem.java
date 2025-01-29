package SinglyLinkedList.InventoryManagementSystem;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        InventoryManagement inventory = new InventoryManagement();

        inventory.addItemAtEnd("Laptop", 101, 10, 800);
        inventory.addItemAtBeginning("Phone", 102, 15, 500);
        inventory.addItemAtPosition("Tablet", 103, 5, 300, 2);
        inventory.displayInventory();

        System.out.println("\nTotal Inventory Value: " + inventory.calculateTotalValue());

        System.out.println("\nSearch by ID (101): ");
        System.out.println(inventory.searchById(101));

        System.out.println("\nSearch by Name (Phone): ");
        System.out.println(inventory.searchByName("Phone"));

        inventory.updateItemQuantity(103, 10);
        System.out.println("\nAfter Updating Quantity of Tablet:");
        inventory.displayInventory();

        System.out.println("\nSort by Name Ascending:");
        inventory.sortInventoryByName(true);
        inventory.displayInventory();

        System.out.println("\nSort by Price Descending:");
        inventory.sortInventoryByPrice(false);
        inventory.displayInventory();

        System.out.println("\nRemove Item with ID 102:");
        inventory.removeItemById(102);
        inventory.displayInventory();
    }
}
