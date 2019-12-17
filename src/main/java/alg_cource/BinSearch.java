package alg_cource;

import java.util.Arrays;

// 二分查找
public class BinSearch {


    public static void main(String []args){
        int[] a = {1, 2, 4 ,5, 8, 9};
//        int i = binSearch(a, 0, a.length - 1, 5);
//        int i = binSearch01(a, 0, a.length - 1, 5);

//        System.out.println(i);

    }


    // 非递归
    private static int binSearch(int[] a, int lo, int hi, int key){

        while (lo <= hi){
            int mid = (lo + hi)/2;
            if (key < a[mid]){
                hi = mid - 1;
            } else if (key > a[mid]){
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    // 递归
    private static int binSearch01(int[] array, int min, int max, int value) {
        if (array.length == 0) {
            return 0;
        }

        int idx = (max + min) / 2;

        if (min <= max) {
            if (array[idx] < value) {
                return binSearch01(array, idx + 1, max, value);
            } else if (array[idx] > value) {
                return binSearch01(array, min, idx - 1, value);
            } else if (array[idx] == value) {
                return idx;
            }
        }

        return idx;
    }
}
