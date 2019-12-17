package case_tree;

/**
 * 遍历二叉树
 */
public class BinTree {

    private static void listTreeNode(TreeNode root){
        if (root == null) { return;}
        System.out.println(root.data);

        listTreeNode(root.left);
        listTreeNode(root.right);
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
