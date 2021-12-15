package leetcode;

import org.junit.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Question0189Test {

    @Test
    public void testRotate() {
        Question0189 solution = new Question0189();
        int nums[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        // k = 0;
        int k = 3;
        solution.rotate1(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        int[] resultNums = new int[]{5, 6, 7, 1, 2, 3, 4};
        Assert.assertArrayEquals(nums, resultNums);

        // k > numbs.length

        nums = new int[]{};
        // k = 0;

        solution.rotate1(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        resultNums = new int[]{};
        Assert.assertArrayEquals(nums, resultNums);


        nums = new int[]{1, 2, 3, 4, 5, 6};
        solution.rotate1(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
        resultNums = new int[]{4, 5, 6, 1, 2, 3};
        Assert.assertArrayEquals(nums, resultNums);
    }
}