package leet_code;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 */
public class LeetCode101 {



    /* 递归 */
    private static boolean mirrorTree(TreeNode tree1, TreeNode tree2) {

        if (tree1 == null && tree2==null) { return true; }

        return (tree1.value == tree2.value)
                && mirrorTree(tree1.left, tree2.left)
                && mirrorTree(tree1.right, tree2.right);

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
