package 题.剑指offer;

/**
 * 题目：给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
 *
 * 输入： 8
 * 输出： 18
 *
 * 18 = 2 * 3 * 3
 *
 */

public class _12剪绳子 {

    public int cutRope(int target) {
        // 方法一： 总体思路： 动态规划
        if (target < 2) return 0;  // 如果输入小于2 那就没法分了...
        if (target == 2) return 1; // 当输入为2或者3，那么只有一种可能
        if (target == 3) return 2;

        int[] product = new int[target + 1]; // 创建 动态规划数组，用于记录每个target位置的乘积最大值

        product[0] = 0;  // 以下为初始值
        product[1] = 1;
        product[2] = 2;
        product[3] = 3;

        int max = 0; // 最大值默认为0


        for (int i = 4; i < target ; i++) {
            for (int j = 1; j < i/2 ; j++) {
                // 从4开始循环，取最大值为当前target的值
                max = Math.max(max, product[j]*product[i-j]);
            }
            product[i] = max;
        }
        return product[target];
    }

}
