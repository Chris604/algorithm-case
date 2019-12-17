package alg_cource;

// 递归算 N!
public class Exp_1120 {

    public static void main(String []args){
        int n = 0;

        int t = total(n);

        System.out.println(t);

    }

    private static int total(int n){
        if (n == 0 || n ==1){
            return n;
        }

        int a = n * total(--n);
        return a;
    }
}