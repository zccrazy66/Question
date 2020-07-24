package 刷题.leetcode.动态规划;

/**
 * @program: Question
 * @description 198
 * @author: zc
 * @create: 2020-07-23 21:39
 **/
public class 打家劫舍 {

    public int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1){
            return nums[0];
        }
        int[] dp = new int[length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }


        return dp[length-1];



    }
}
