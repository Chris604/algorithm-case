package experiment;

// 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
public class Tree108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) { return null; }
        int hi = nums.length - 1;
        TreeNode root = helper(nums, 0, hi);
        return root;
    }

    private static TreeNode helper(int[] nums, int lo, int hi){
        int mid = (lo + hi)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = helper(nums, 0, mid-1);
        root.right = helper(nums, mid +1, hi);
        return root;
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
