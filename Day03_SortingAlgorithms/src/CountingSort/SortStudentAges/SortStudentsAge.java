package CountingSort.SortStudentAges;

public class SortStudentsAge {
    public static int[] sortAge(int[] ages) {
        int N = ages.length;
        int M = 0;

        for(int i = 0; i < N; i++) {
            M = Math.max(M, ages[i]);
        }

        int[] countArray = new int[M + 1];

        for(int i = 0; i < N; i++) {
            countArray[ages[i]]++;
        }

        for(int i = 1; i <= M; i++) {
            countArray[i] += countArray[i - 1];
        }

        int[] outputArray = new int[N];

        for(int i = N - 1; i >= 0; i--) {
            outputArray[countArray[ages[i]] - 1] = ages[i];
            countArray[ages[i]]--;
        }

        return outputArray;
    }
}
