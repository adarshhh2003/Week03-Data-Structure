package StringConcatenation;

public class StringConcatenation {
    private int n;
    StringConcatenation(int n) {
        this.n = n;
    }

    public void stringConcat() {
        long start = System.nanoTime();
        String str = "";

        for(int i=0; i<n; i++) {
            str += "hello";
        }
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used in String concatenation is: " + difference/1000000.0 + " ms, and number of concatenation is: " + n);
    }

    public void stringBuilderConcat() {
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            sb.append("hello");
        }
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used by StringBuilder concatenation is: " + difference/1000000.0 + " ms, and number of concatenation is: " + n);
    }

    public void stringBufferConcat() {
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<n; i++) {
            sb.append("hello");
        }
        long end = System.nanoTime();
        long difference = end-start;
        System.out.println("The time used by StringBuffer concatenation is: " + difference/1000000.0 + " ms, and number of concatenation is: " + n);
    }
}
