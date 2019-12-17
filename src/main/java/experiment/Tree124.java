package experiment;

// 给定一个非空二叉树，返回其最大路径和。
public class Tree124 {

    int res = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        helper(root);
        return res;
    }

    private int helper(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        res = Math.max(left + right + root.val, res);
        return Math.max(0, Math.max(left, right)+root.val);
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
