package leetcode;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public void addLeft(int x) {
        left = new TreeNode(x);
    }

    public TreeNode getLeft() {
        return left;
    }

    public void addRight(int x) {
        right = new TreeNode(x);
    }

    public TreeNode getRight() {
        return right;
    }
}
