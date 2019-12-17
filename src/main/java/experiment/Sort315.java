package experiment;

import java.util.ArrayList;
import java.util.List;

// 给定一个整数数组 nums，按要求返回一个新数组 counts。数组 counts 有该性质： counts[i] 的值是  nums[i] 右侧小于 nums[i] 的元素的数量。
public class Sort315 {

    public static void main(String []args){
        int []  num = {5,2,6,1,0};
        List<Integer> integers = countSmaller(num);

        System.out.print(integers);
    }

    // 使用循环，时间复杂度 O(n2)
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> cnt = new ArrayList<Integer>();

        for (int i = 0; i< nums.length; i++){
            int a = 0;
            for (int j = i + 1; j< nums.length; j++){
                if (nums[i] > nums[j]){
                    a++;
                }
            }
            cnt.add(a);
        }
        return cnt;
    }

    //
    public static List<Integer> countSmaller1(int[] nums) {
        List<Integer> cnt = new ArrayList<Integer>();

        for (int i = 0; i< nums.length; i++){
            int a = 0;
            for (int j = i + 1; j< nums.length; j++){
                if (nums[i] > nums[j]){
                    a++;
                }
            }
            cnt.add(a);
        }
        return cnt;
    }
}
