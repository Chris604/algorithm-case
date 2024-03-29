package experiment;

// 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
public class Array283 {

    public static void main(String[] args){
        int[] a = {0,1,0,3,12};
        moveZeroes(a);
    }



    public static void moveZeroes(int[] nums) {
        int m = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                for (int j = m+1; j < nums.length; j++){
                    if (nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        m = j;
                        break;
                    }
                }
            }
        }

        for (int i:nums){
            System.out.println(i);
        }
    }
}
