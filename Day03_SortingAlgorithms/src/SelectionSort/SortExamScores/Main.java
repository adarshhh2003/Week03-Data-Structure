package SelectionSort.SortExamScores;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] scores = {83, 58, 98, 65, 45, 76, 25, 36, 96};
        SortExamScores.sortScores(scores);
        System.out.println("Sorted exam scores are: " + Arrays.toString(scores));
    }
}
