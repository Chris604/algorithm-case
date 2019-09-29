package leet_code;

/**
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 *
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 */
public class LeetCode617 {

    private static TreeNode mergeTree(TreeNode t1, TreeNode t2) {

        // t1、t2均为空时，返回空
        if (t1 == null && t2 == null) {
            return null;
        }


        TreeNode t3 = new TreeNode((t1 == null ? 0 : t1.value) + (t2 == null ? 0 : t2.value));

        t3.left = mergeTree(t1 == null ? null : t1.left, t2 == null ? null : t2.left);
        t3.right = mergeTree(t1 == null ? null : t1.right, t2 == null ? null : t2.right);

        return t3;
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        private TreeNode(int value) {
            this.value = value;
        }

    }
}
