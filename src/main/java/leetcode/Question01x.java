package leetcode;


import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Question01x {


    public static int getLongestSubStringLength(String s) {
        if (s == null || s.length() == 0) return 0;

        int max = 1;
        int first = 0, last = 0;
        HashMap<Character, Integer> chars = new HashMap<>();
        chars.put(s.charAt(first), first);

        while (first <= last && last < s.length() - 1) {
            last++;
            if (chars.keySet().contains(s.charAt(last)) && chars.get(s.charAt(last)) >= first) {
                first = chars.get(s.charAt(last)) + 1;
            } else {
                max = last - first + 1 > max ? last - first + 1 : max;
            }
            chars.put(s.charAt(last), last);
        }
        return max;
    }

    public static int getLongestSubStringLength2(String s) {
        if (s == null || s.length() == 0) return 0;

        int max = 0;
        int first = 0, last = 0;
        Set<Character> chars = new HashSet<>();

        while (first <= last && last < s.length()) {
            char c = s.charAt(last);
            while(chars.contains(c)){
                chars.remove(s.charAt(first));
                // fist ++
                first ++;
            }
            chars.add(c);
            max = last - first + 1 > max ? last - first + 1 : max;
            //    last ++
            last++;

        }
        return max;
    }

    @Test
    public void test() {
        Assert.assertEquals(getLongestSubStringLength("presssssent"), 4);
        Assert.assertEquals(getLongestSubStringLength("present"), 4);
        Assert.assertEquals(getLongestSubStringLength(""), 0);
        Assert.assertEquals(getLongestSubStringLength("1"), 1);
        Assert.assertEquals(getLongestSubStringLength("111"), 1);
    }


    @Test
    public void test2() {
        Assert.assertEquals(getLongestSubStringLength2("presssssent"), 4);
        Assert.assertEquals(getLongestSubStringLength2("present"), 4);
        Assert.assertEquals(getLongestSubStringLength2(""), 0);
        Assert.assertEquals(getLongestSubStringLength2("1"), 1);
        Assert.assertEquals(getLongestSubStringLength2("111"), 1);
    }
}
