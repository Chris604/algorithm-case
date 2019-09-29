package leet_code;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class LeetCode07 {

    public static void main(String []args) {
        int a = 15123;
        int result = reverInte(a);

        System.out.println(result);
    }

    private static int reverInte(int value){
        int rev = 0;
        while(value != 0){
            int pop = value % 10;
            value /= 10;

            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop <-8)) return 0;

            rev = rev * 10 + pop;
        }

        return rev;
    }
}
