package experiment;

import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.ArrayList;
import java.util.List;

// 给定一个二叉搜索树，编写一个函数 kthSmallest 来查找其中第 k 个最小的元素。
public class Tree230 {

    static ArrayList<Integer> res = new ArrayList<Integer>();

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {return 0;}
        inOrder(root);
        return res.get(k-1);
    }

    // 中序遍历
    private static List<Integer> inOrder(TreeNode root){
        if (root == null) { return null; }
        if (root.left != null) { inOrder(root.left); }
        res.add(root.val);
        if (root.right != null) { inOrder(root.right); }
        return res;
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
