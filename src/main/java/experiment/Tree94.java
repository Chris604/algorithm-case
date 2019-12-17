package experiment;

import java.util.ArrayList;
import java.util.List;

// 二叉树中序遍历
public class Tree94 {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {

        if (root == null) { return null; }
        if(root.left != null){
            inorderTraversal(root.left);
        }
        list.add(root.val);
        if (root.right != null) {
            inorderTraversal(root.right);
        }
        return list;
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
