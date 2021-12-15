package leetcode;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Question0088Test {

    @Test
    public void testMerge() {
        Question0088 solution = new Question0088();
        int nums1[] = new int[]{1, 2, 3, 0, 0, 0};
        int nums2[] = new int[]{2, 5, 6};

        solution.merge(nums1, 3, nums2, nums2.length);
        Question0088.printArray(nums1);
        int[] resultNums = new int[]{1, 2, 2, 3, 5, 6};
        Assert.assertArrayEquals(nums1, resultNums);

        nums1 = new int[]{1, 2, 3};
        nums2 = new int[]{};
        solution.merge(nums1, 0, nums2, nums2.length);
        Question0088.printArray(nums1);
        resultNums = new int[]{1, 2, 3};
        Assert.assertArrayEquals(nums1, resultNums);

        nums1 = new int[3];
        nums2 = new int[]{1, 2, 3};
        solution.merge(nums1, 0, nums2, nums2.length);
        Question0088.printArray(nums1);
        resultNums = new int[]{1, 2, 3};
        Assert.assertArrayEquals(nums1, resultNums);
    }
}