package QuickSort.SortProductPrices;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] productPrices = {83, 58, 98, 65, 45, 76, 25, 36, 96};
        SortProductPrices.sortPrices(productPrices, 0, productPrices.length-1);
        System.out.println("Sorted Product Prices are: " + Arrays.toString(productPrices));
    }
}
