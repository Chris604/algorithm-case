package experiment;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 二叉树的锯齿遍历
public class Tree103 {

    // 使用双端队列
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) { return null; }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue= new LinkedList<TreeNode>();
        queue.add(root);
        int index = 1;
        while (!queue.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            int size = queue.size();

            while (size-- > 0){
                if (index%2 != 0){
                    TreeNode remove = queue.remove();
                    if (remove.left!=null) { queue.add(remove.left); }
                    if (remove.right!=null) { queue.add(remove.right); }
                    list.add(remove.val);
                } else {
                    TreeNode remove = ((LinkedList<TreeNode>) queue).removeLast();
                    if (remove.right!=null) { ((LinkedList<TreeNode>) queue).addFirst(remove.right); }
                    if (remove.left!=null) { ((LinkedList<TreeNode>) queue).addFirst(remove.left); }
                    list.add(remove.val);
                }
            }
            index++;
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
