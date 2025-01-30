package HashmapAndHashFunction.LongestConsecutiveSequence;

import java.util.HashMap;

public class longestConsecutiveSequence {
    public static int longestConsecutive(int[] arr) {
        HashMap<Integer, Boolean> mp = new HashMap<>();

        for(int num: arr) {
            mp.put(num, true);
        }
        int maxLength = 0;
        for(int num: arr) {
            if(!mp.containsKey(num-1)) {
                int length = 1;
                int currentNum = num;

                while(mp.containsKey(currentNum+1)) {
                    currentNum++;
                    length++;
                }
                maxLength = Math.max(maxLength, length);
            }
        }
        return maxLength;
    }
}
