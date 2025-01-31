package BubbleSort.SortStudentMarks;

public class SortStudentMarks {

    public static void sortStudentMarks(int[] marks) {
        int size = marks.length;
        boolean swapped;
        for(int i=0; i<size-1; i++) {
            swapped = false;
            for(int j=0; j<size-i-1; j++) {
                if(marks[j] > marks[j+1]) {
                    swapped = true;
                    int temp = marks[j];
                    marks[j] = marks[j+1];
                    marks[j+1] = temp;
                }
            }
            if(!swapped) {
                break;
            }
        }
    }
}
