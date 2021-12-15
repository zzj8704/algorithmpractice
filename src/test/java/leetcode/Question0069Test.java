package leetcode;

import junit.framework.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class Question0069Test {

    @Test
    public void testMySqrt() {
    }

    @Test
    public void testMySqrt1() {
    }

    @Test
    public void testMySqrt2() {
        Question0069 question0069 = new Question0069();
        int ans = question0069.mySqrt1(0);
        Assert.assertEquals(0, ans);

        ans = question0069.mySqrt1(2);
        Assert.assertEquals(1, ans);

        ans = question0069.mySqrt1(3);
        Assert.assertEquals(1, ans);

        ans = question0069.mySqrt1(4);
        Assert.assertEquals(2, ans);

        ans = question0069.mySqrt1(5);
        Assert.assertEquals(2, ans);

        ans = question0069.mySqrt1(24);
        Assert.assertEquals(4, ans);


        int N = 10000 * 10;
        long c = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            ans = question0069.mySqrt2(Integer.MAX_VALUE);
        }
        System.out.println(Integer.MAX_VALUE + ":" + (System.currentTimeMillis() - c));

         c = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            ans = question0069.mySqrt1(Integer.MAX_VALUE, 1000);
        }
        System.out.println(Integer.MAX_VALUE + ":" + (System.currentTimeMillis() - c));


    }
}