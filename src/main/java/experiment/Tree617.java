package experiment;

// 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
public class Tree617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) { return t2; }
        if (t2 == null) { return t1; }

        t1.val = t1.val + t2.val;

        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);

        return t1;
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
