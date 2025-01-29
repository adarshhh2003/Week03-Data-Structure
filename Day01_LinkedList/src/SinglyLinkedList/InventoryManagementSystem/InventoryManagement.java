package SinglyLinkedList.InventoryManagementSystem;

import SinglyLinkedList.StudentRecordManagement.Student;

public class InventoryManagement {
    private Item head;

    public void addItemAtBeginning(String name, int id, int quantity, int price) {
        Item newItem = new Item(name, id, quantity, price);

        newItem.next = head;
        head = newItem;
    }

    public void addItemAtEnd(String name, int id, int quantity, int price) {
        Item newItem = new Item(name, id, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }

    public void addItemAtPosition(String itemName, int itemId, int quantity, int price, int position) {
        Item newItem = new Item(itemName, itemId, quantity, price);
        if (position <= 1 || head == null) {
            addItemAtBeginning(itemName, itemId, quantity, price);
            return;
        }

        Item temp = head;
        int count = 1;
        while (temp.next != null && count < position - 1) {
            temp = temp.next;
            count++;
        }
        newItem.next = temp.next;
        temp.next = newItem;
    }

    public void removeItemById(int itemId) {
        if (head == null) return;

        if (head.id == itemId) {
            head = head.next;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.id != itemId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public void updateItemQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }

    public Item searchById(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == itemId) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Item searchByName(String itemName) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(itemName)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public double calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        return totalValue;
    }

    public void displayInventory() {
        if (head == null) {
            System.out.println("No items in inventory.");
            return;
        }

        Item temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void sortInventoryByName(boolean ascending) {
        head = mergeSort(head, "name", ascending);
    }

    public void sortInventoryByPrice(boolean ascending) {
        head = mergeSort(head, "price", ascending);
    }

    private Item mergeSort(Item head, String criterion, boolean ascending) {
        if (head == null || head.next == null) return head;

        Item middle = getMiddle(head);
        Item nextToMiddle = middle.next;
        middle.next = null;

        Item left = mergeSort(head, criterion, ascending);
        Item right = mergeSort(nextToMiddle, criterion, ascending);

        return merge(left, right, criterion, ascending);
    }

    private Item merge(Item left, Item right, String criterion, boolean ascending) {
        if (left == null) return right;
        if (right == null) return left;

        boolean condition;
        if (criterion.equals("name")) {
            condition = ascending ? left.name.compareToIgnoreCase(right.name) <= 0 : left.name.compareToIgnoreCase(right.name) > 0;
        } else {
            condition = ascending ? left.price <= right.price : left.price > right.price;
        }

        if (condition) {
            left.next = merge(left.next, right, criterion, ascending);
            return left;
        } else {
            right.next = merge(left, right.next, criterion, ascending);
            return right;
        }
    }

    private Item getMiddle(Item head) {
        if (head == null) return head;

        Item slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
