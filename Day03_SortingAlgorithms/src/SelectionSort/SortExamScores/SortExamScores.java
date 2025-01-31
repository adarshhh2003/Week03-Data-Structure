package SelectionSort.SortExamScores;

public class SortExamScores {
    public static void sortScores(int[] scores) {

        for(int i=0; i<scores.length-1; i++) {
            int smallest = i;
            for(int j=i+1; j<scores.length; j++) {
                if(scores[smallest] > scores[j]) {
                    smallest = j;
                }
            }
            int temp = scores[smallest];
            scores[smallest] = scores[i];
            scores[i] = temp;
        }
    }
}
