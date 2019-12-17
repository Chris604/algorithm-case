package experiment;

import java.util.ArrayList;

// 合并两个二叉树
public class BinTree01 {

    // 递归
    private TreeNode comTree(TreeNode root1, TreeNode root2){

        TreeNode root = new TreeNode(0);

        if (root1 == null) { return root2; }
        if (root2 == null) { return root1; }

        // 先合并根结点
        root.val = root1.val + root2.val;

        // 合并子节点
        root.left = comTree(root1.left, root2.left);
        root.right = comTree(root1.right, root2.right);

        return root;
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
