package StringBuilder.RemoveDuplicate;

import java.util.HashSet;

public class RemoveDuplicate {

    public static String removeDuplicate(String input) {
        HashSet<Character> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<input.length(); i++) {
            if(!hashSet.contains(input.charAt(i))) {
                sb.append(input.charAt(i));

                if(input.charAt(i) != ' ')
                    hashSet.add(input.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello my name is adarsh";
        String result = removeDuplicate(input);

        System.out.println("Original String: " + input);
        System.out.println("Wtihout Duplicate: " + result);
    }
}