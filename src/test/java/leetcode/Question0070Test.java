package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Question0070Test {

    @Test
    public void testClimbStairs() {
        Question0070 question0070 = new Question0070();
        int result = question0070.climbStairs(3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void testClimbStairs1() {
        Question0070 question0070 = new Question0070();
        int result = question0070.climbStairs1(3);
        Assert.assertEquals(3, result);
    }
}