package leetcode;


import javafx.util.Pair;
import org.junit.Test;

import java.util.HashMap;

public class Question00X {

    public static Pair<Integer, Character> getTopChar(String s) {
        if(s == null) {
            return null;
        }
        Pair<Integer, Character> result = new Pair<>(1, s.charAt(0));
        HashMap<Character, Integer> code = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            code.put(c, code.getOrDefault(c, 0) + 1);
            if (result.getKey() < code.get(c)) {
                result = new Pair<>(code.get(c), c);
            }
        }
        return result;
    }

    @Test
   public void test(){
        System.out.println(getTopChar("p"));
        System.out.println(getTopChar("present"));
        System.out.println(getTopChar("pppppppp"));

   }
}
