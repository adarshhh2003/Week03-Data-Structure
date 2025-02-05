package ChallengeProblem.CompareStringBuilderStringBuffer;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        int n = 1000000;
        List<String> list = new ArrayList<>();
        list.add("hello");

        long stringBuilderTime = CompareTime.stringBuilderTime(list, n);
        long stringBufferTime = CompareTime.stringBufferTime(list, n);

        System.out.println("The Time taken by StringBuilder is: " + stringBuilderTime);
        System.out.println("The Time taken by StringBuffer is: " + stringBufferTime);
        System.out.println("The difference time between StringBuffer and StringBuilder is: " + (stringBufferTime-stringBuilderTime));
    }
}
