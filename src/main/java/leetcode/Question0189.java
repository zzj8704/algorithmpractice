package leetcode;


import org.junit.Assert;

public class Question0189 {

    public void rotate1(int[] nums, int k) {
        if (nums.length < 2) return;
        int count = 0;
        for (int i = 0; i < k % nums.length; i++) {
            int last = nums[i];
            for (int j = i + k; j < (nums.length + 1) * k && count < nums.length; j = j + k) {
                nums[i] = nums[j % nums.length];
                nums[j % nums.length] = last;
                last = nums[i];
                count++;
                if (j % nums.length == i) break;
            }
        }
    }

    //
//        int left = nums.length % k;
//        for (int i = 0; i < count; i++) {
//            int last = nums[i];
//            if (nums.length - k >= (nums.length / k * k))
//                nums[i] = nums[nums.length - k];
//            else
//                nums[i] = nums[left + i];
//        }
//    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}


