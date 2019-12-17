package experiment;

import java.util.ArrayList;
import java.util.List;

// 二叉树的中序遍历
public class BinTree03 {



    private List<Integer> qweq1(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (root == null) {return null;}

        qweq(root.left);

        list.add(root.val);

        qweq(root.right);


        return list;
    }

    private static void qweq(TreeNode root) {
        if (root == null) {return;}

        System.out.println(root.left.val);
        qweq(root);
        System.out.println(root.right.val);
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
