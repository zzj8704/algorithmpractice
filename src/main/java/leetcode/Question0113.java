package leetcode;

import java.util.*;

public class Question0113 {
    private List<Integer> toList(Stack<Integer> path) {
        List<Integer> alist = new ArrayList<Integer>();
        for (int i = 0; i < path.size(); i++) {
            alist.add(path.get(i));

        }
        //System.out.println(StringUtils.join(alist, ","));
        return alist;
    }

    private void internalPathSum(TreeNode current, int reminder, List<List<Integer>> result, Stack<Integer> path) {
        if (current == null) {
            return;
        }

        path.push(current.val);

        // terminate condition
        if (reminder == current.val && current.left == null && current.right == null) {
            result.add(toList(path));
        }
        // left
        //System.out.println("before left：" + StringUtils.join(path, ","));
        internalPathSum(current.left, reminder - current.val, result, path);

        //System.out.println("before right：" + StringUtils.join(path, ","));
        // right
        internalPathSum(current.right, reminder - current.val, result, path);

        path.pop();
    }


    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Stack<Integer> path = new Stack<Integer>();
        internalPathSum(root, sum, result, path);
        return result;
    }


    List<List<Integer>> ret = new LinkedList<List<Integer>>();
    Deque<Integer> path = new LinkedList<Integer>();

    public List<List<Integer>> pathSum1(TreeNode root, int sum) {
        dfs(root, sum);
        return ret;
    }

    public void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        path.offerLast(root.val);
        sum -= root.val;
        if (root.left == null && root.right == null && sum == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        dfs(root.left, sum);
        dfs(root.right, sum);
        path.pollLast();
    }


    Map<TreeNode, TreeNode> map = new HashMap<TreeNode, TreeNode>();

    public List<List<Integer>> pathSum2(TreeNode root, int sum) {
        if (root == null) {
            return ret;
        }

        Queue<TreeNode> queueNode = new LinkedList<TreeNode>();
        Queue<Integer> queueSum = new LinkedList<Integer>();
        queueNode.offer(root);
        queueSum.offer(0);

        while (!queueNode.isEmpty()) {
            TreeNode node = queueNode.poll();
            int rec = queueSum.poll() + node.val;

            if (node.left == null && node.right == null) {
                if (rec == sum) {
                    getPath(node);
                }
            } else {
                if (node.left != null) {
                    map.put(node.left, node);
                    queueNode.offer(node.left);
                    queueSum.offer(rec);
                }
                if (node.right != null) {
                    map.put(node.right, node);
                    queueNode.offer(node.right);
                    queueSum.offer(rec);
                }
            }
        }

        return ret;
    }

    public void getPath(TreeNode node) {
        List<Integer> temp = new LinkedList<Integer>();
        while (node != null) {
            temp.add(node.val);
            node = map.get(node);
        }
        Collections.reverse(temp);
        ret.add(new LinkedList<Integer>(temp));
    }

}

