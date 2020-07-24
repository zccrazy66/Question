package 刷题.leetcode.动态规划;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-20 21:25
 **/
public class 完全平方数 {

    public static int numSquares(int n) {
//        int length =(int) Math.sqrt(n) + 1;
        int[] dp = new int[n];
//        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 2; i < n; i++) {
            for (int j = 1; j*j <= i; j++) {
                dp[i] = Math.min(i,dp[i-j*j] + 1);
            }
        }
        return dp[n-1];
    }

    public static void main(String[] args) {
        int a = 5;
        System.out.println(numSquares(a));
    }


}
