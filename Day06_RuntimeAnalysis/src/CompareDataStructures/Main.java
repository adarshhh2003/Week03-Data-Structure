package CompareDataStructures;

public class Main {
    public static void main(String[] args) {
        CompareDataStructures compareDataStructures1 = new CompareDataStructures(1000, 900);
        compareDataStructures1.searchOnArray();
        compareDataStructures1.searchOnHashSet();
        compareDataStructures1.searchOnTreeSet();
        System.out.println();

        CompareDataStructures compareDataStructures2 = new CompareDataStructures(100000, 90000);
        compareDataStructures2.searchOnArray();
        compareDataStructures2.searchOnHashSet();
        compareDataStructures2.searchOnTreeSet();
        System.out.println();

        CompareDataStructures compareDataStructures3 = new CompareDataStructures(1000000, 900000);
        compareDataStructures3.searchOnArray();
        compareDataStructures3.searchOnHashSet();
        compareDataStructures3.searchOnTreeSet();
    }
}
