package BinarySearch.SearchTargetIn2DMatrix;

public class SearchInMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0;
        int right = rows * cols;

        while(left <= right) {
            int mid = left + (right - left) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if(matrix[row][col] == target) {
                System.out.println("Element found at: (" + row + ", " + col + ")");
                return true;
            } else if(matrix[row][col] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}};
        int target = 16;

        boolean found = searchMatrix(matrix, target);

        System.out.println("Element is present: " + found);
    }
}
