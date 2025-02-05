package BinarySearch.FindPeakElement;

public class FindPeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]) {
                return mid;
            } else if(arr[mid] < arr[mid-1]) {
                right = mid-1;
            } else {
                left = mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 13, 4, 2};
        int index = findPeakElement(arr);

        System.out.println("The peak element index is: " + index);
    }
}
