package 刷题.leetcode.动态规划;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-23 15:13
 **/
public class 零钱兑换 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0 && dp[i - coin] != amount + 1) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        if (dp[amount] == amount + 1) {
            dp[amount] = -1;
        }
        return dp[amount];


    }


}
