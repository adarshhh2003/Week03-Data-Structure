package HeapSort.SortJobApplicantsBySalary;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] salary = {83000, 58000, 98000, 65000, 45000, 76000, 25000, 36000, 9600};
        SortJobApplicantBySalary.sortSalary(salary);
        System.out.println("Sorted job applicant by salary: " + Arrays.toString(salary));
    }
}
