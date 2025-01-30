package HashmapAndHashFunction.PairWithGivenSum;

import java.util.HashMap;

public class PairWithGivenSum {

    public static boolean hasPairWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> numIndexMap = new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            int compliment = target - arr[i];

            if(numIndexMap.containsKey(compliment)) {
                System.out.println("Pair Found: " + arr[i] + " and " + compliment + " At indices: " + i + " and " + numIndexMap.get(compliment));
                return true;
            }

            numIndexMap.put(arr[i], i);
        }

        System.out.println("Pair not found");
        return false;
    }
}
