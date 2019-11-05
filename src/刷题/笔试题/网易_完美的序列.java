package 刷题.笔试题;


import java.util.Scanner;

/**
 *
 * 给一个序列，后面的数要比前面的和要大，
 * 输出最长连续子序列
 *
 */


public class 网易_完美的序列 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; ++i) nums[i] = scanner.nextInt();

            int[] dp = new int[n];  //dp[i] 为 0到i的最长子序列的元素和
            dp[0] = nums[0];


            int cnt = 1;
            int res = 1;


            for (int i = 1; i < n; ++i) {
                if (nums[i] >= dp[i - 1]) {
                    dp[i] = dp[i - 1] + nums[i];
                    ++ cnt;
                    res = Math.max(res, cnt);
                } else {
                    dp[i] = nums[i];
                    cnt = 1;
                }

            }
            System.out.println(res);


        }
//
//        Scanner in = new Scanner(System.in);
//        int T = in.nextInt();
//
//        while (T-- > 0){
//            int geshu = in.nextInt();
//            int[] shuzu = new int[geshu];
//            for (int i = 0; i < geshu; i++) {
//                shuzu[i] = in.nextInt();
//            }
//
////            System.out.println(shuzu);
//            int t = panbie(shuzu);
//            System.out.println(t);
//        }
//
//
//
//    }
//
//    private static int panbie(int[] res){
//
//        int[] dp = new int[res.length];
//        dp[0] = res[0];
////        dp[1] = res[1];
//        if (res.length == 1){
//            return 1;
//        }
//        int count = 0;
//
//        for (int i = 1; i < res.length; i++) {
////            int temp = 0;
//            if (res[i]>=dp[i-1]){
//                dp[i] = dp[i-1] + res[i];
//                count++;
//            }else {
//                count = 1;
////                temp = i - temp;
//                dp[i] = res[i];
//            }
////            count = Math.max(temp, i-temp+1);
//        }
//
//        return count;



    }

//    private static void digui (int[] a){
//        int length = a.length;
//
//        for ()




//    }







}
