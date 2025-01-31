package HeapSort.SortJobApplicantsBySalary;

public class SortJobApplicantBySalary {
    public static void sortSalary(int salary[]) {
        int n = salary.length;

        for (int i=n/2-1; i>=0; i--)
            heapify(salary, n, i);

        for (int i=n-1; i>=0; i--) {

            int temp = salary[0];
            salary[0] = salary[i];
            salary[i] = temp;

            heapify(salary, i, 0);
        }
    }

    public static void heapify(int salary[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l<n && salary[l] > salary[largest])
            largest = l;

        if (r < n && salary[r] > salary[largest])
            largest = r;

        if (largest != i) {
            int swap = salary[i];
            salary[i] = salary[largest];
            salary[largest] = swap;

            heapify(salary, n, largest);
        }
    }
}
