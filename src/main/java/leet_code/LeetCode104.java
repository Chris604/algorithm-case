package leet_code;

/**
 * 找到二叉树的最大深度
 */
public class LeetCode104 {


    // 递归实现
    private static int maxDeep(TreeNode root){
        if (root == null) {
            return 0;
        }

        return Math.max(maxDeep(root.left), maxDeep(root.right)) + 1;
    }


    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        private TreeNode(int data){
            this.data = data;
        }
    }
}
