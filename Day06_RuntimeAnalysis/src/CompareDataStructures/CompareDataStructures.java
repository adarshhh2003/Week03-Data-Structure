package CompareDataStructures;

import java.util.HashSet;
import java.util.TreeSet;

public class CompareDataStructures {
    int[] arr;
    HashSet<Integer> hashSet;
    TreeSet<Integer> treeSet;
    int n;
    int target;
    CompareDataStructures(int n, int target) {
        this.n = n;
        this.target = target;
        this.arr = new int[n];
        this.hashSet = new HashSet<>();
        this.treeSet = new TreeSet<>();

        for(int i=0; i<n; i++) {
            this.arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }
    }

    public void searchOnArray() {
        long start = System.nanoTime();

        for(int i=0; i<n; i++) {
            if(arr[i] == target) {
                break;
            }
        }

        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used by array to find the target is: " + difference/1000000.0 + " ms");
    }

    public void searchOnHashSet() {
        long start = System.nanoTime();
        hashSet.contains(target);
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used by HashSet to find target is: " + difference/1000000.0 + " ms");
    }

    public void searchOnTreeSet() {
        long start = System.nanoTime();
        treeSet.contains(target);
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used by TreeSet to find target is: " + difference/1000000.0 + " ms");
    }
}
