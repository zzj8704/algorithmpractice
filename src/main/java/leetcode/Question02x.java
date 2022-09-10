package leetcode;


import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class Question02x {


    public static boolean isValidString(String s) {
        if (s == null || s.length() == 0) return true;
        Stack<Character> notMatched = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                notMatched.push(s.charAt(i));
            } else if (s.charAt(i) == ')' && !notMatched.isEmpty() && notMatched.peek() == '(') {
                notMatched.pop();
            } else if (s.charAt(i) == ')' && notMatched.isEmpty()) {
                return false;
            } else if (s.charAt(i) == ')') {
                notMatched.push(s.charAt(i));
            }
        }
        return notMatched.isEmpty();
    }


    @Test
    public void test() {
        Assert.assertEquals(isValidString("abcd"), true);
        Assert.assertEquals(isValidString("()()()"), true);
        Assert.assertEquals(isValidString("((((present))))"), true);
        Assert.assertEquals(isValidString("((((present))))((((present))))"), true);
        Assert.assertEquals(isValidString(")((((present))))"), false);
        Assert.assertEquals(isValidString("((((present)))"), false);
        Assert.assertEquals(isValidString("((((present)))))"), false);
    }
}
