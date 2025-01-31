package CountingSort.SortStudentAges;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ages = {17, 10, 17, 12, 15, 14, 13, 18, 11};
        int[] result = SortStudentsAge.sortAge(ages);
        System.out.println("Sorted age of student are: " + Arrays.toString(result));
    }
}
