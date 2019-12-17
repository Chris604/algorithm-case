package experiment;

// 对称二叉树
public class BinTree04 {

    public boolean isSymmetric(TreeNode root, TreeNode root1) {
        if (root == null && root1 == null) { return true;}
        if (root == null || root1 == null) { return false;}
        if (root.val != root1.val) { return false;}

        return isSymmetric(root.left, root1.right) && isSymmetric(root.right, root1.left);
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        private TreeNode (int val){
         this.val = val;
        }
    }
}
