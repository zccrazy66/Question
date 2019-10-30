package 刷题.剑指offer;

/**
 * 题目： 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 *       每一次只能向左，右，上，下四个方向移动一格，
 *       但是不能进入行坐标和列坐标的数位之和大于k的格子。
 *
 * 示例： 当k为18时，机器人能够进入方格（35,37），因为 3+5+3+7 = 18。
 *       但是，它不能进入方格（35,38），因为 3+5+3+8 = 19。
 *       请问该机器人能够达到多少个格子？
 */


public class _11机器人的运动范围 {

    /**
     *
     * @param threshold 目标数
     * @param rows  行
     * @param cols  列
     * @return
     */

    public int movingCount(int threshold, int rows, int cols)
    {

        // 思路 ：还是用回溯法0
        boolean[][] flag = new boolean[rows][cols];
        return judge(threshold, 0,0, rows, cols, flag);

    }

    private int judge(int threshold, int i, int j, int rows, int cols , boolean[][] flag){

        int sum = i/10 + i%10 + j/10 +j%10;

        if (i<0 || j<0 || i>=rows || j>=cols || sum > threshold || flag[i][j] == true){
            return 0;
        }

        flag[i][j] = true;

        return judge(threshold, i-1, j, rows, cols, flag) +
            judge(threshold, i+1, j, rows, cols, flag) +
            judge(threshold, i, j-1, rows, cols, flag) +
            judge(threshold, i, j+1, rows, cols, flag) + 1;

    }

}
