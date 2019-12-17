package experiment;

// 求二叉树的最大深度
public class BinTree02 {

    private static int deepth1(TreeNode root, int i){

        if (root == null) { return 0; }

        i += 1;

        i = deepth1(root.left, i) > deepth1(root.right, i) ? deepth1(root.left, i):deepth1(root.right, i);

        return i;
    }

    // 递归
    private static int maxDepth(TreeNode root){

        if (root == null) { return 0; }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        private TreeNode(int val){
            this.val = val;
        }
    }
}
