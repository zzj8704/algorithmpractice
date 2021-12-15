package leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 */

//给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
//
// 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
//
//
//
// 示例 1:
//
// 输入: [3,2,3]
//输出: 3
//
// 示例 2:
//
// 输入: [2,2,1,1,1,2,2]
//输出: 2
//
// Related Topics 位运算 数组 分治算法
// 👍 744 👎 0

public class Question0169 {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.get(nums[i]) > nums.length / 2) {
                return nums[i];
            }
        }
        return 0;
    }

//    private int countInRange(int[] nums, int num, int lo, int hi) {
//        int count = 0;
//        for (int i = lo; i <= hi; i++) {
//            if (nums[i] == num) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    private int majorityElementRec(int[] nums, int lo, int hi) {
//        // base case; the only element in an array of size 1 is the majority
//        // element.
//        if (lo == hi) {
//            return nums[lo];
//        }
//
//        // recurse on left and right halves of this slice.
//        int mid = (hi - lo) / 2 + lo;
//        int left = majorityElementRec(nums, lo, mid);
//        int right = majorityElementRec(nums, mid + 1, hi);
//
//        // if the two halves agree on the majority element, return it.
//        if (left == right) {
//            return left;
//        }
//
//        // otherwise, count each element and return the "winner".
//        int leftCount = countInRange(nums, left, lo, hi);
//        int rightCount = countInRange(nums, right, lo, hi);
//
//        return leftCount > rightCount ? left : right;
//    }
//
//    public int majorityElement(int[] nums) {
//        return majorityElementRec(nums, 0, nums.length - 1);
//    }
//
//    作者：LeetCode-Solution
//    链接：https://leetcode-cn.com/problems/majority-element/solution/duo-shu-yuan-su-by-leetcode-solution/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
}

