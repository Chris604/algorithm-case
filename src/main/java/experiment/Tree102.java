package experiment;

import java.util.*;

// 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
public class Tree102 {

    // 使用队列进行层次遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            while (size-- > 0) {
                TreeNode pop = queue.remove();
                list.add(pop.val);
                if (pop.left != null) {
                    queue.add(pop.left);
                }
                if (pop.right != null) {
                    queue.add(pop.right);
                }
            }
            res.add(list);
        }
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
