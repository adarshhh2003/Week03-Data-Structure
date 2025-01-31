package MergeSort.SortArrayBookPrices;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] bookPrices = {83, 58, 98, 65, 45, 76, 25, 36, 96};
        SortBookPrices.mergeBookPrices(bookPrices, 0, bookPrices.length-1);
        System.out.println("Sorted Prices of books are: " + Arrays.toString(bookPrices));
    }
}
