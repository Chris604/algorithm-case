package experiment;

/**
 * 给定一个长度为n的数组，且数据中的元素在0-n之间，找出其中重复的元素
 */
public class StringDump {


    private int[] dumpInt(int[] nums){
        if (nums.length == 0) { return null; }
        // 对nums数组进行排序

        int n = nums.length;
        int[] a = {};
        for (int i=0; i<n; i++) {
            if (nums[i] != i) {
                nums[i] = nums[nums[i]];
            }
        }
        return null;
    }
}
