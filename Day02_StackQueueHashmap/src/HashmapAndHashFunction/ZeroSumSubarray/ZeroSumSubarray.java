package HashmapAndHashFunction.ZeroSumSubarray;

import java.util.*;

public class ZeroSumSubarray {
    public static void findZeroSumSubarray(int[] arr) {
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        int sum = 0;

        sumMap.put(0, new ArrayList<>(Arrays.asList(-1)));

        for(int i=0; i<arr.length; i++) {
            sum += arr[i];

            if(sumMap.containsKey(sum)) {
                for(int start: sumMap.get(sum)) {
                    System.out.println("Subarray Found: " + (start+1) + " to " + i);
                }
            }

            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }
    }
}
