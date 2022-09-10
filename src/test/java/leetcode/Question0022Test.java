package leetcode;

import org.junit.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Question0022Test {

    @Test
    public void testGenerateParentheses() {
        Question0022 question0022 = new Question0022();
        List<String> result = question0022.generateParenthesis(3);
        System.out.println(String.join("\r\n", result));
    }
}