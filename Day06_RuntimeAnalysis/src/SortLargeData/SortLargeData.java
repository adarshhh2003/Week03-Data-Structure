package SortLargeData;

public class SortLargeData {
    int[] arr;

    SortLargeData(int n) {
        this.arr = new int[n];

        for(int i=0; i<n; i++) {
            this.arr[i] = (int) (Math.random()*n) +1;
        }
    }

    public void bubbleSort() {
        int size = arr.length;
        long start = System.nanoTime();
        for(int i=0; i<size-1; i++) {
            boolean swapped = false;
            for(int j=0; j<size-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used by bubble sort is: " + difference/1000000.0 + "ms , number of elements is: " + size);
    }

    public void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid-start+1;
        int n2 = end-mid;

        int[] startArray = new int[n1];
        int[] endArray = new int[n2];

        System.arraycopy(arr, 0 , startArray, 0 , n1);
        System.arraycopy(arr, mid+1, endArray, 0, n2);

        int i=0, j=0, k=start;

        while (i<n1 && j<n2) {
            if(startArray[i] <= endArray[j]) {
                arr[k] = startArray[i];
                i++;
            } else {
                arr[k] = endArray[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            arr[k] = startArray[i];
            k++;
            i++;
        }

        while(j < n2) {
            arr[k] = endArray[j];
            k++;
            j++;
        }
    }

    public void mergeSortRecursion(int[] arr, int start, int end) {
      if(start < end) {
          int mid = start + (end - start) / 2;
          mergeSortRecursion(arr, start, mid);
          mergeSortRecursion(arr, mid + 1, end);

          merge(arr, start, mid, end);
      }
    }

    public void mergeSort() {
        long start = System.nanoTime();
        int size = arr.length;
        mergeSortRecursion(arr, 0, size-1);
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used by merge sort is: " + difference/1000000.0 + " ms, and the number of elments is: " + size);
    }

    public int partition(int[] arr, int low, int high) {
       int pivot = arr[high];
       int i = low-1;

       for(int j=low; j<high; j++) {
           if(arr[j] < pivot) {
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }

       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;

       return i+1;
    }

    public void applyQuickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pivot = partition(arr, low, high);

            applyQuickSort(arr, low, pivot-1);
            applyQuickSort(arr, pivot+1, high);
        }
    }

    public void quickSort() {
        long start = System.nanoTime();
        int size = arr.length;
        applyQuickSort(arr, 0, size-1);
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used by quick sort is: " + difference/1000000.0 + " ms, and the number of elements is: " + size);
    }
}
