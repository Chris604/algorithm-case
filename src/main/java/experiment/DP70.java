package experiment;

// 爬楼梯
public class DP70 {

    public static void main(String[] args){
        int a = climbStairs(4);
//        int a = climbStairs1(4);
        System.out.println(a);
    }

    // 动态规划
    public static int climbStairs1(int n) {
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;

        for (int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }

    // 递归
    public static int climbStairs(int n) {
        if (n==0 || n==1 || n==2) { return n; }
        return climbStairs(n-1) + climbStairs(n-2);
    }
}
