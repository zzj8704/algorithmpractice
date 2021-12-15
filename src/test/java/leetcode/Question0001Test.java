package leetcode;

import junit.framework.Assert;
import org.testng.annotations.Test;

public class Question0001Test {

    @Test
    public void testTwoSum() {
        Question0001 solution = new Question0001();
        int nums[] = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        Assert.assertEquals(result[0], 0);
        Assert.assertEquals(result[1], 1);

        nums = new int[]{1, 7, 11, 15, 8, 9};
        result = solution.twoSum(nums, target);
        Assert.assertEquals(result[0], 0);
        Assert.assertEquals(result[1], 4);

        nums = new int[]{};
        result = solution.twoSum(nums, target);
        Assert.assertEquals(result, null);


        nums = null;
        result = solution.twoSum(nums, target);
        Assert.assertEquals(result, null);
    }
}