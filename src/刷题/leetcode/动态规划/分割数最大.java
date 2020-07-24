package 刷题.leetcode.动态规划;

/**
 * @program: Question
 * @description leetcode 343
 * @author: zc
 * @create: 2020-07-20 20:31
 **/
public class 分割数最大 {
//      递归
//    public int integerBreak(int n) {
//        // 边接条件
//        return breakInteger(n);
//    }
//
//
//    private static int breakInteger(int n){
//        if (n == 1){
//            return 1;
//        }
//        int res = -1;
//        for (int i = 1; i < n; i++) {
//            res = Math.max(res, Math.max(i*(n-1),i*breakInteger(n-i)));
//        }
//
//        return res;
//    }

    // 动态规划
    public int integerBreak(int n){
        int[] dp = new int[n];

        dp[1] = 1;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max(j*(i-j),j*dp[i-j]));
            }
        }
        return dp[n-1];
    }


}
