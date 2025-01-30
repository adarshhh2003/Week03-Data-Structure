package HashmapAndHashFunction.CustomHashMap;

class CustomHashMap {
    private static final int SIZE = 10; // Fixed bucket size

    class Node {
        int key, value;
        Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private Node[] buckets;

    public CustomHashMap() {
        buckets = new Node[SIZE]; // Initialize array of linked lists
    }

    private int hash(int key) {
        return key % SIZE; // Simple hash function
    }

    // Insert key-value pair
    public void put(int key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (buckets[index] == null) {
            buckets[index] = newNode;
        } else {
            Node temp = buckets[index];
            while (temp.next != null) {
                if (temp.key == key) { // Update existing key
                    temp.value = value;
                    return;
                }
                temp = temp.next;
            }
            temp.next = newNode; // Insert new key-value pair
        }
    }

    // Get value by key
    public Integer get(int key) {
        int index = hash(key);
        Node temp = buckets[index];

        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return null; // Key not found
    }

    // Remove key-value pair
    public void remove(int key) {
        int index = hash(key);
        Node temp = buckets[index], prev = null;

        while (temp != null) {
            if (temp.key == key) {
                if (prev == null) buckets[index] = temp.next; // Remove head node
                else prev.next = temp.next; // Remove middle or end node
                return;
            }
            prev = temp;
            temp = temp.next;
        }
    }

    // Display the hash map
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Bucket " + i + ": ");
            Node temp = buckets[i];
            while (temp != null) {
                System.out.print("(" + temp.key + " -> " + temp.value + ") ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(11, 110); // Collision with key 1
        map.put(21, 210); // Collision with key 1 and 11

        System.out.println("Value of key 2: " + map.get(2)); // Output: 20
        map.display();

        map.remove(11);
        System.out.println("\nAfter removing key 11:");
        map.display();
    }
}
