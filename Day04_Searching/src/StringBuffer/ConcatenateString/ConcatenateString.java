package StringBuffer.ConcatenateString;

import java.util.Arrays;

public class ConcatenateString {

    public static String concatenateString(String[] array) {
        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0; i<array.length; i++) {
            stringBuffer.append(array[i] + " ");
        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        String[] array = {"Hello", "my", "name", "is", "adarsh"};
        String result = concatenateString(array);

        System.out.println("Original Strings of array: " + Arrays.toString(array));
        System.out.println("After concatenation of string: " + result);
    }
}
