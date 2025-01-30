package HashmapAndHashFunction.TwoSum;

import java.util.HashMap;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];

            if(mp.containsKey(complement)) {
                return new int[]{mp.get(complement), i};
            }

            mp.put(nums[i], i);
        }

        return new int[]{};
    }
}
