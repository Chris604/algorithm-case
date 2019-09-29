package leet_code;

/* 求两数值和 */
public class LeetCode001 {
    public static int[] twoSum(int[] nums, int target) {
        int [] t = {};
        for (int i=0; i<nums.length; i++) {
            for (int j=0;  j<nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    t[0] = i;
                    t[1] = j;
                    return t;
                }
            }
        }
        return t;
    }

    public static void main(String []args) {
        int [] s = {1, 2, 3 ,4};
        int [] ta = twoSum(s, 3);
        System.out.print(ta);
    }
}
