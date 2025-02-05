package StringBuilder.ReverseString;

public class StringBuilderReverse {

    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();

        for(int i=input.length()-1; i>=0; i--) {
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverseString(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }
}
