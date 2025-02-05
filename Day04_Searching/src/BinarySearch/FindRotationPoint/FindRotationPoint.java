package BinarySearch.FindRotationPoint;

public class FindRotationPoint {
    public static int findRotationPoint(int[] arr) {
        int left = 0;;
        int right = arr.length-1;

        while(left < right) {
            int mid = left + (right - left) / 2;

            if(mid > 0 && arr[mid] < arr[mid-1]) {
                return mid;
            } else if(arr[mid] > arr[left]) {
                left = mid+1;
            } else {
                right = mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 2, 3, 4};
        int index = findRotationPoint(arr);

        System.out.println("The index of rotation point is: " + index);
    }
}
