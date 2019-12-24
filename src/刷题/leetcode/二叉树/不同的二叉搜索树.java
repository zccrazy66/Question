package 刷题.leetcode.二叉树;

/**
 * 题目： 给定一个整数，求以 1 ... n 为节点组成的二叉搜索树有多少种
 */


public class 不同的二叉搜索树 {


    public int numTrees(int n) {

        if (n <= 2){
            return 1;
        }

        int[] dp = new int[n];

        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n + 1; i++)
            for(int j = 1; j < i + 1; j++)
                dp[i] += dp[j-1] * dp[i-j];

        return dp[n - 1];

        // 叫什么公式来着？ leetcode 96


    }


}
