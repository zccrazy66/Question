package 刷题.笔试题;

import java.util.Scanner;

/**
 * 题目：
 * 两种花，一种白花一种红花，摆放时红花随便可以放，白花连花数量只能是
 * k的倍数，现在给区间【a，b】 有几种摆花方案？
 *
 *
 * 输入
 * 3 2 （3组，倍数为2）
 * 1 3
 * 2 3
 * 4 4
 *
 * 输出
 * 6 例子：红红红 白白红 红白白 红红 白白 红
 * 5
 * 5
 *
 */

public class tx_养花 {

        static int cnt = 0;
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int t = scanner.nextInt();
            int k = scanner.nextInt();
            while (t-- > 0) {
                cnt = 0;
                int left = scanner.nextInt();
                int right = scanner.nextInt();
                //k == 0, 不能放白花
                if (k == 0) {
                    System.out.println(right - left + 1);
                    continue;
                }
                for (int i = left; i <= right; ++i) {
                    dfs(k, 0, 0, i);
                    dfs(k, 1, 0, i);
                }
                System.out.println(cnt);
            }
        }

        /**
         *
         * @param k
         * @param pre : 上一次的颜色
         * @param curr ： 这次是第几个
         * @param right： 最大几个
         */
        public static void dfs(int k, int pre, int curr, int right) {

            //递归终点
            if (curr == right) {
                ++ cnt;
                return;
            }
            for (int end = curr; end <= right; ++ end) {
                if (pre == 1) {
                    //上一个是红，这次放白
                    if ((end - curr + 1) % k == 0 ) {
                        dfs(k, 0, end + 1, right);
                    }

                } else {
                    //上一个白
                    dfs(k, 1, end + 1, right);
                }
            }


        }
    }







