package StringConcatenation;

public class Main {
    public static void main(String[] args) {
        StringConcatenation s1 = new StringConcatenation(1000);
        s1.stringConcat();
        s1.stringBuilderConcat();
        s1.stringBufferConcat();
        System.out.println();

        StringConcatenation s2 = new StringConcatenation(10000);
        s2.stringConcat();
        s2.stringBuilderConcat();
        s2.stringBufferConcat();
        System.out.println();

        StringConcatenation s3 = new StringConcatenation(1000000);
        s3.stringConcat();
        s3.stringBuilderConcat();
        s3.stringBufferConcat();
    }
}
