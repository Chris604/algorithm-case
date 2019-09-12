package case_tree;

/**
 * 二叉树遍历
 */
public class BinaryTree {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        preOrder(root);
    }

    /* 递归 */
    private static void preOrder(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }

        if (treeNode.left == null) {
            System.out.println(treeNode.value);
            preOrder(treeNode.left);
            preOrder(treeNode.rigth);
        }
    }

    static class TreeNode {
        int value;
        TreeNode left;
        TreeNode rigth;

        public TreeNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "value==" + value;
        }
    }
}

