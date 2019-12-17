package alg_cource;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 正整数 N 用二进制表示，并转为string
public class Exp_119 {

    public static void main(String []args){
//        String s = reverString(5);
        String s = reString(5);
        System.out.println(s);
    }

    // 循环
    private static String reverString(Integer N){

        String s = "";
        for (int n = N; n>0; n/=2){
            s = (n % 2) + s;
        }
        return s;
    }

    // 使用 stack
    private static String reString(Integer N){
        String s = "";
        Stack S = new Stack();
        while (N > 0){
            int i = N%2;
            S.push(i);
            N = N/2;
        }
        while (S.size() > 0){
            s = s + S.pop();
        }

        return s;
    }
}
