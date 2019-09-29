package leet_code;

/**
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class LeetCode100 {

    /* 递归 */
    private static boolean compareTree(TreeNode tr1, TreeNode tr2) {

        // 两树均为空，则相等
        if (tr1 == null && tr2 == null) {
            return true;
        }

        // 两树均不为空
        if (tr1 != null && tr2 != null) {
            if (tr1.value == tr2.value) {
                return compareTree(tr1.left, tr2.left) && compareTree(tr1.right, tr2.right);
            } else {
                return false;
            }
        }

        return false;
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value) {
            this.value = value;
        }
    }
}
