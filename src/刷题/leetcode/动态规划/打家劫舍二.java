package 刷题.leetcode.动态规划;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-23 21:52
 **/
public class 打家劫舍二 {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length <= 2){
            return 0;
        }
        int[] dp = new int[length + 1];
        dp[0] = nums[length - 1];
        dp[1] = Math.max(nums[0], nums[length - 1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
        }

        return dp[length] - dp[0];


    }
}
