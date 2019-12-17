package experiment;

// 给定不同面额的硬币 coins 和一个总金额 amount。
// 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
public class DP322 {
    public static void main(String[]args){
        int[] coins = {2};
        int amount = 11;
        int a = coinChange(coins, amount);
        System.out.println(a);
    }

    // 动态规划
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        dp[0] = 0;
        for (int i=1; i<=amount; i++){
            dp[i] = amount+1;
            for (int coin:coins){
                if (i>=coin){
                    dp[i] = Math.min(dp[i], dp[i-coin]+1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
}
