package SearchTarget;

public class Main {
    public static void main(String[] args) {
        SearchTarget s1 = new SearchTarget(1000);
        s1.linearSearch(996);
        s1.binarySearch(996);

        SearchTarget s2 = new SearchTarget(10000);
        s2.linearSearch(9997);
        s2.binarySearch(9997);

        SearchTarget s3 = new SearchTarget(1000000);
        s3.linearSearch(99994);
        s3.binarySearch(99994);
    }
}
