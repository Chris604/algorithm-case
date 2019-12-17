package experiment;

import java.util.List;
import java.util.Stack;

// 给定一个二叉树，返回其节点值的锯齿形层次遍历。（即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）。
public class Stack03 {


    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null){ return null; }
        int a = 1;
        Stack<TreeNode> st = new Stack<TreeNode>();
        while (root != null){

        }


        return null;
    }

    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
     }
}
