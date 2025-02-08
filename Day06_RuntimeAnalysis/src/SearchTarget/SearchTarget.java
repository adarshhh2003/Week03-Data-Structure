package SearchTarget;

public class SearchTarget {
    int[] arr;

    SearchTarget(int n) {
        this.arr = new int[n];

        for(int i=0; i<n; i++) {
            this.arr[i] = i;
        }
    }

    public void linearSearch(int target) {
        System.out.println("Linear search for the array size: " + arr.length);
        long start = System.nanoTime();
        boolean flag = true;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                flag = false;
                System.out.println("Target Found");
                break;
            }
        }

        long end = System.nanoTime();
        long difference = end-start;
        if(flag)
        System.out.println("Target is not present in the array");
        System.out.println("Time used by linear search is: " + difference/1000000.0 + " ms");
        System.out.println();
    }

    public void binarySearch(int target) {
        System.out.println("Binary search for the array size: " + arr.length);
        long start = System.nanoTime();
        int left = 0;
        int right = arr.length-1;
        boolean flag = true;
        while(left<=right) {
            int mid = left+(right-left)/2;

            if(arr[mid] == target) {
                flag = false;
                System.out.println("Target Found");
                break;
            } else if(arr[mid] < target) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        long end = System.nanoTime();
        long difference = end-start;
        if(flag)
        System.out.println("Target is not present in the array");
        System.out.println("Time used by binary search is: " + difference/1000000.0 + " ms");
        System.out.println();
    }
}
