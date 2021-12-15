package leetcode;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class Question0070 {

    // time: O(n*n)
    // space:O(1)
    public int climbStairs(int n) {
        if (n <= 2) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }


    // time: O(n)
    // space:O(n)
    public int climbStairs1(int n) {
        if(n <= 2) return n;
        int[] steps = new int[n];
        steps[0] = 1;
        steps[1] = 2;
        for (int i = 2; i < n; i++) {
            steps[i] = steps[i - 1] + steps[i - 2];
        }
        return steps[n - 1];
    }
}



