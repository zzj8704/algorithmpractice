package leetcode;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Question0026Test {

    @Test
    public void testRemoveDuplicates() {
        Question0026 solution = new Question0026();
        int nums[] = new int[]{1, 1, 2};
        int result = solution.removeDuplicates(nums);
        Assert.assertEquals(result, 2);
        int[] resultNums = Arrays.copyOf(nums, result);
        Assert.assertArrayEquals(new int[]{1, 2}, resultNums);

        nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        result = solution.removeDuplicates(nums);
        Assert.assertEquals(result, 5);
        resultNums = Arrays.copyOf(nums, result);
        Assert.assertArrayEquals(new int[]{0, 1, 2, 3, 4}, resultNums);

        nums = new int[]{};
        result = solution.removeDuplicates(nums);
        Assert.assertEquals(result, 0);
        resultNums = Arrays.copyOf(nums, result);
        Assert.assertArrayEquals(new int[]{}, resultNums);
    }
}