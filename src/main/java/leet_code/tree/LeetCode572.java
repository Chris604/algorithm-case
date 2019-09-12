package leet_code.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
 * s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 */
public class LeetCode572 {

    /* 判断两棵树是否相等 */
    private static boolean compareTree(TreeNode root1, TreeNode root2) {

        // 两树均为空，返回 true
        if (root1 == null && root2 == null) {
            return true;
        }

        // 一空一非空，返回 false
        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data == root2.data) {
            return compareTree(root1.left, root2.left) && compareTree(root1.rigth, root2.rigth);
        }

        return false;
    }

    /* 判断是左右子树 */
    private static boolean subTree(TreeNode root1, TreeNode root2) {
        // 两树均为空，返回 true
        if (root1 == null && root2 == null) {
            return true;
        }

        // 一空一非空，返回 false
        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.data == root1.data) {
            return compareTree(root1, root2) || subTree(root1.left, root2) || subTree(root1.rigth, root2);
        }
        // 根节点不同，需要判断是否为子树
        return subTree(root1.left, root2) || subTree(root1.rigth, root2);
    }

    /* 定义树节点 */
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode rigth;

        TreeNode(int data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "data==" + data;
        }
    }
}
