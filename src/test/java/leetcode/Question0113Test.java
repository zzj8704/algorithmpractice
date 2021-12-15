package leetcode;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Question0113Test {

    @Test
    public void testPathSum() {
        Question0113 question0113 = new Question0113();

        TreeNode root = new TreeNode(5);
        root.addLeft(4);
        root.getLeft().addLeft(11);
        root.getLeft().getLeft().addLeft(7);
        root.getLeft().getLeft().addRight(2);

        root.addRight(8);
        root.getRight().addLeft(13);
        root.getRight().addRight(4);

        root.getRight().getRight().addLeft(5);
        root.getRight().getRight().addRight(1);

        List<List<Integer>> result = question0113.pathSum(root, 22);
        List<Integer> expected = Arrays.asList(5, 4, 11, 2);
        Assert.assertEquals(result.get(0), expected);

        expected = Arrays.asList(5, 8, 4, 5);
        Assert.assertEquals(result.get(1), expected);
    }
    @Test
    public void testOne() {
        Question0113 question0113 = new Question0113();

        TreeNode root = new TreeNode(1);
        root.addLeft(2);

        List<List<Integer>> result = question0113.pathSum(root, 1);
        Assert.assertEquals(result.size(), 0);

    }

    @Test
    public void testS1One() {
        Question0113 question0113 = new Question0113();

        TreeNode root = new TreeNode(1);
        root.addLeft(2);

        List<List<Integer>> result = question0113.pathSum1(root, 1);
        List<Integer> expected = Arrays.asList(1);
        Assert.assertEquals(result.size(), 0);

    }
}