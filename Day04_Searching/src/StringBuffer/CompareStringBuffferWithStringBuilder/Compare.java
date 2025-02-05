package StringBuffer.CompareStringBuffferWithStringBuilder;

public class Compare {

    public static void compare() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuffer stringBuffer = new StringBuffer();

        long start = System.nanoTime();
        for(int i=0; i<1000000; i++) {
            stringBuilder.append("hello");
        }

        long end = System.nanoTime();
        long stringBuilderTime = end-start;
        System.out.println("Time taken by StringBuilder in nano seconds is: " + stringBuilderTime);

        start = System.nanoTime();
        for(int i=0; i<1000000; i++) {
            stringBuffer.append("hello");
        }

        end = System.nanoTime();
        long stringBufferTime = end-start;
        System.out.println("Time taken by StringBuffer in nano seconds is: " + stringBufferTime);

        long difference = stringBufferTime-stringBuilderTime;
        System.out.println("The difference between the time of StringBuffer and StringBuilder is: " + difference);
    }

    public static void main(String[] args) {
        compare();
    }
}
