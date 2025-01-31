package InsertionSort.SortEmployeeIds;

public class SortEmployeeIds {

    public static void sortEmployeeIds(int[] employeeIds) {
        int size = employeeIds.length;

        for(int i=1; i<size; i++) {
            int key = employeeIds[i];
            int j = i-1;
            while(j >= 0 && employeeIds[j] > key) {
                employeeIds[j+1] = employeeIds[j];
                j--;
            }
            employeeIds[j+1] = key;
        }
    }
}
