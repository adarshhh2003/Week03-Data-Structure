package SortLargeData;

public class Main {
    public static void main(String[] args) {
        SortLargeData a1 = new SortLargeData(1000);
        a1.bubbleSort();
        SortLargeData a2 = new SortLargeData(1000);
        a2.mergeSort();
        SortLargeData a3 = new SortLargeData(1000);
        a3.quickSort();
        System.out.println();

        SortLargeData b1 = new SortLargeData(10000);
        b1.bubbleSort();
        SortLargeData b2 = new SortLargeData(10000);
        b2.mergeSort();
        SortLargeData b3 = new SortLargeData(10000);
        b3.quickSort();
        System.out.println();

        SortLargeData c1 = new SortLargeData(1000000);
        c1.bubbleSort();
        SortLargeData c2 = new SortLargeData(1000000);
        c2.mergeSort();
        SortLargeData c3 = new SortLargeData(1000000);
        c3.quickSort();
    }
}
