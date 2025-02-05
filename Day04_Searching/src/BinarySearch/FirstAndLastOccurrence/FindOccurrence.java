package BinarySearch.FirstAndLastOccurrence;

public class FindOccurrence {
    public static int[] findFirstAndLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int first = -1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(arr[mid] == target) {
                first = mid;
                last = mid;

                int tempLeft = mid-1;
                while(arr[tempLeft] == target) {
                    first = tempLeft;
                    tempLeft--;
                }

                int tempRight = mid+1;
                while(arr[tempRight] == target) {
                    last = tempRight;
                    tempRight++;
                }
                return new int[]{first, last};
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 5, 5, 6};
        int target = 5;
        int[] result = findFirstAndLastOccurrence(arr, target);

        System.out.println("First and last occurrence of the element " + target + " is: " + result[0] + ", " + result[1]);
    }
}
