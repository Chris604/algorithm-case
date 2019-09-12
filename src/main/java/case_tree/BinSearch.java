package case_tree;

/* 二分查找 */
public class BinSearch {


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 6, 9, 10, 12, 15, 18, 23};
        int idx = binSearch1(array, 0, array.length - 1, 15);

//        int idx = binSearch2(array, 23);
        System.out.println(idx);
    }


    /**
     * 递归实现
     */
    private static int binSearch1(int[] array, int min, int max, int value) {
        if (array.length == 0) {
            return 0;
        }

        int idx = (max + min) / 2;

        if (min <= max) {
            if (array[idx] < value) {
                return binSearch1(array, idx + 1, max, value);
            } else if (array[idx] > value) {
                return binSearch1(array, min, idx - 1, value);
            } else if (array[idx] == value) {
                return idx;
            }
        }

        return idx;
    }


    /**
     * 非递归实现
     */
    private static int binSearch2(int[] array, int value) {
        int min = 0;
        int max = array.length - 1;

        int idx = 0;

        while (min <= max) {
            idx = (min + max) / 2;
            if (array[idx] < value) {
                min = idx + 1;
            } else if (array[idx] > value) {
                max = idx - 1;
            } else if (array[idx] == value) {
                return idx;
            }
        }
        return idx;
    }
}
