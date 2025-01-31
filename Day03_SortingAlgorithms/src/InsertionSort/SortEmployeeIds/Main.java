package InsertionSort.SortEmployeeIds;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] employeeIds = {83, 58, 98, 65, 45, 76, 25, 36, 96};
        SortEmployeeIds.sortEmployeeIds(employeeIds);
        System.out.println(Arrays.toString(employeeIds));
    }
}
