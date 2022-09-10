package leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class Question0001 {

    //Approach 1: Brute Force
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //Approach 2: Two-pass Hash Table
    public int[] twoSum2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        return null;
    }

    // Approach 3: One-pass Hash Table
    public int[] twoSum3(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}



