package leetcode;

import junit.framework.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Question0169Test {

    @Test
    public void testMajorityElement() {
        Question0169 question = new Question0169();
        int ans = question.majorityElement(new int[] {2,2,1,1,1,2,2});
        Assert.assertEquals(ans, 2);

        ans = question.majorityElement(new int[] {3,2,3});
        Assert.assertEquals(ans, 3);
    }
}