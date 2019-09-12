package leet_code.tree;

import java.util.Arrays;


/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 *
 * 二叉树的根是数组中的最大元素。
 * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 * 输入：[3,2,1,6,0,5]
 */
public class LeetCode654 {

    // 找到最大值的索引，然后将数组分割后递归
    public  TreeNode createMaxTree(int[] nums) {
        int maxPos = maxPos(nums);

        if (maxPos == -1) {
            return null;
        }

        int[] leftArray = Arrays.copyOfRange(nums, 0, maxPos);
        int[] rightArray = Arrays.copyOfRange(nums, maxPos + 1, nums.length);

        TreeNode root = new TreeNode(nums[maxPos]);
        root.left = createMaxTree(leftArray);
        root.right = createMaxTree(rightArray);

        return root;
    }

    private int maxPos(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }

        int pos = -1;
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max <= nums[i]) {
                pos = i;
                max = nums[i];
            }
        }
        return pos;
    }

    static class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode(int value){
            this.value = value;
        }
    }
}
