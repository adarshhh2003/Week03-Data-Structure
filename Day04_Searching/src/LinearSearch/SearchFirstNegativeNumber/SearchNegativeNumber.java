package LinearSearch.SearchFirstNegativeNumber;

public class SearchNegativeNumber {
    public static int searchFirstNegativeNumber(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]<0) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 7, -5, -7, -7, 5, 74, -36};
        int index = searchFirstNegativeNumber(arr);

        System.out.println("First negative number is at: " + index);
    }
}
