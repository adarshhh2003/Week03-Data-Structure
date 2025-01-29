package SinglyLinkedList.InventoryManagementSystem;

public class Item {
    String name;
    int id;
    int quantity;
    int price;
    Item next;

    public Item(String name, int id, int quantity, int price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }

    public String toString() {
        return "ItemID: " + id + ", ItemName: " + name + ", Quantity: " + quantity + ", Price: " + price;
    }
}
