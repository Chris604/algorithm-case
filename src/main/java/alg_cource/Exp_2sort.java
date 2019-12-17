package alg_cource;

// 几种排序算法
public class Exp_2sort {

    public static void main(String []args){
        int[] a = {1, 3, 6 ,5, 2, 7};
//        int[] ints = sort01(a);
        int[] ints = sort02(a);

        for (int i :ints){
            System.out.print(i);
        }
    }

    // 选择排序，每次选择最小的数值放在剩余的首位置
    private static int[] sort01(int[] a){
        for (int i= 0 ; i<a.length-1; i++){
            int t = a[i];
            int b = 0;

            for (int j = i+1; j< a.length; j++){
                if (t > a[j]){
                    t = a[j];
                    b = j;
                }
            }
            if (b >0){
                a[b] = a[i];
                a[i] = t;
            }
        }

        return a;
    }

    // 插入排序，将第 i 个元素与左边的元素一次比较，若比它小，则交换位置，保证左边数组有序
    private static int[] sort02(int[] a){

        for (int i=0; i < a.length; i++){
            for (int j = i-1; j>0; j--){
                if(a[j+1] < a[j]){
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }

        return a;
    }

    // 希尔排序，引入 gap 的概念
    private static int[] sort03(int[] a){

        return a;
    }
}
