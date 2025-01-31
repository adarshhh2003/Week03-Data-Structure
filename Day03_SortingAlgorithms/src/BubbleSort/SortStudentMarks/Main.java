package BubbleSort.SortStudentMarks;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] marks = {83, 58, 98, 65, 45, 76, 25, 36, 96};
        SortStudentMarks.sortStudentMarks(marks);
        System.out.println(Arrays.toString(marks));
    }
}
