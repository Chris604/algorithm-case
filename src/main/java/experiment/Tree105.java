package experiment;

// 根据一棵树的前序遍历与中序遍历构造二叉树。
public class Tree105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0 || inorder.length == 0) { return null;}
        TreeNode root = new TreeNode(preorder[0]);
        return root;
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
