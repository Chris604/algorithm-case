package leet_code;

/**
 * 二叉树的中序遍历
 */
public class LeetCode94 {


    private static void midPrint(TreeNode root){
        midPrint(root.left);
        System.out.println(root.data);
        midPrint(root.right);
    }

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        private TreeNode(int data){
            this.data = data;
        }
    }
}
