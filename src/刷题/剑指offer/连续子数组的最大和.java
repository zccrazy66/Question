package 刷题.剑指offer;

/**
 * 题目： 给定一个数组，返回它的最大连续子序列的和
 *
 * 输入：{6, -3, -2, 7, -15, 1, 2, 2}
 *
 *       连续子向量的最大和为8(从第0个开始,到第3个为止)
 *
 */



public class 连续子数组的最大和 {

    public int FindGreatestSumOfSubArray(int[] array) {

        int res = array[0]; //记录当前所有子数组的和的最大值
        int max=array[0];   //包含array[i]的连续数组最大值
        for (int i = 1; i < array.length; i++) {
            max=Math.max(max+array[i], array[i]);
            res=Math.max(max, res);
        }
        return res;
//        int length = array.length;
//
//        if (length == 0){return 0;}
//        if (length == 1){return array[0];}
//
//        int count = array[0];
//        int[] dp = new int[length];
//        dp[0] = array[0];
//
//        for (int i = 1; i < length ; i++) {
//            count += array[i];
//
//            if (array[i] < 0){
//                dp[i] = dp[i-1];
//            }
////            if (count + array[i] > dp[i-1]){
////                dp[i] = count   + array[i];
////            }
//            dp[i] = Math.max(count , dp[i-1]);
//
//            if (dp[i] > dp[i-1]){
//                count = array[i];
//            }
//        }
//
//
//        return dp[length-1];

    }


}
