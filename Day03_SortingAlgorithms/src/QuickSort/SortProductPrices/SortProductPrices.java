package QuickSort.SortProductPrices;

public class SortProductPrices {

    public static int partition(int[] productPrices, int low, int high) {
        int pivot = productPrices[high];
        int i = low - 1;

        for(int j=low; j<high; j++) {
            if(pivot > productPrices[j]) {
                i++;
                int temp = productPrices[i];
                productPrices[i] = productPrices[j];
                productPrices[j] = temp;
            }
        }

        i++;
        int temp = productPrices[i];
        productPrices[i] = pivot;
        productPrices[high] = temp;

        return i;
    }

    public static void sortPrices(int[] productPrices, int low, int high) {
        if(low < high) {
            int pivot = partition(productPrices, low, high);

            sortPrices(productPrices,low, pivot-1);
            sortPrices(productPrices, pivot+1, high);
        }
    }
}
