package ChallengeProblem.LinearAndBinarySearch;
import java.util.Arrays;

public class SearchChallenge {

    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            int value = Math.abs(arr[i]);
            if (value >= 1 && value <= n) {
                arr[value - 1] = -Math.abs(arr[value - 1]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1, 7, 5};
        int target = 5;

        int missingNumber = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missingNumber);

        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        int index = binarySearch(arr, target);
        System.out.println("Index of target " + target + ": " + index);
    }
}
