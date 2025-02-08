package FibonacciComputation;

public class FibonacciComputation {

    public static int fibonacciRecursive(int n) {
        if(n <= 1) {
            return n;
        }

        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public static void recursive(int n) {
        long start = System.nanoTime();
        FibonacciComputation.fibonacciRecursive(n);
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used in computing fibonacci recursively is: " + difference/1000000.0 + " ms");
    }

    public static int fibonacciIterative(int n) {
        int a = 0;
        int b = 1;
        int sum;

        for(int i=2; i<=n; i++) {
            sum = a+b;
            a = b;
            b = sum;
        }

        return b;
    }

    public static void iterative(int n) {
        long start = System.nanoTime();
        FibonacciComputation.fibonacciIterative(n);
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used in computing fibonacci iteratively is: " + difference/1000000.0 + " ms");
    }
}
