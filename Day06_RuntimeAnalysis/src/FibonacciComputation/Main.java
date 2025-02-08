package FibonacciComputation;

public class Main {
    public static void main(String[] args) {
        FibonacciComputation.recursive(10);
        FibonacciComputation.iterative(10);
        System.out.println();

        FibonacciComputation.recursive(30);
        FibonacciComputation.iterative(30);
        System.out.println();

        FibonacciComputation.recursive(50);
        FibonacciComputation.iterative(50);
    }
}
