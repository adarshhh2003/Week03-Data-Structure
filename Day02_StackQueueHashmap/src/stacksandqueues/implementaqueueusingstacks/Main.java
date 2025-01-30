package stacksandqueues.implementaqueueusingstacks;

public class Main {
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
//       queue.dequeue();  //Check if list is empty
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue());  // Output: 1
        System.out.println(queue.dequeue());  // Output: 2
        queue.enqueue(4);
        System.out.println(queue.dequeue());  // Output: 3
        System.out.println(queue.dequeue());  // Output: 4
    }
}
