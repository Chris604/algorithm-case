package alg_cource;

// 欧几里得求最大公约数
public class Exp_1125 {

    public static void main(String []args){
        int a = Sp(1111111, 1234567);
        System.out.println(a);
    }

    private static int Sp(int a, int b){
        int ma = Math.max(a, b);
        int mi = Math.min(a, b);

        int mod = ma%mi;
        int sp = 0;

        if (mod == 0){
            return mi;
        }

        return Sp(mi, mod);
    }
}
