package MergeSort.SortArrayBookPrices;

public class SortBookPrices {
    public static void mergeBookPrices(int[] bookPrices, int left, int right) {
        if(left < right) {
            int mid = left + (right - left) / 2;

            mergeBookPrices(bookPrices, left, mid);
            mergeBookPrices(bookPrices, mid+1, right);

            mergePrices(bookPrices, left, mid, right);
        }
    }

    public static void mergePrices(int[] bookPrices, int left, int mid, int right) {
        int size1 = mid - left + 1;
        int size2 = right-mid;

        int[] leftArr = new int[size1];
        int[] rightArr = new int[size2];

        System.arraycopy(bookPrices, left, leftArr, 0, size1);
        System.arraycopy(bookPrices, mid+1, rightArr, 0, size2);

        int i = 0;
        int j = 0;
        int k = left;

        while(i < size1 && j < size2) {
            if(leftArr[i] <= rightArr[j]) {
                bookPrices[k++] = leftArr[i++];
            } else {
                bookPrices[k++] = rightArr[j++];
            }
        }

        while(i < size1) {
            bookPrices[k++] = leftArr[i++];
        }

        while(j < size2) {
            bookPrices[k++] = rightArr[j++];
        }
    }
}
