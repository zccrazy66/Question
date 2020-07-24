package 刷题.leetcode.每日一题;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-12 19:35
 **/
public class 地下城游戏 {
    public int calculateMinimumHP(int[][] dungeon) {
        int row = dungeon.length;
        int col = dungeon[0].length;
        int[][] dp = new int[row][col];
        if (dungeon[0][0] < 0){
            dp[0][0] = -dungeon[0][0];
        }else {
            dp[0][0] = 0;
        }
        dp[1][0] = (dp[0][0] + dungeon[1][0])>0?dp[0][0]: -(dp[0][0] + dungeon[1][0]);
        dp[0][1] = (dp[0][0] + dungeon[0][1])>0?dp[0][0]: -(dp[0][0] + dungeon[0][1]);
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
                if (dp[i][j] + dungeon[i][j] < 0){
                    dp[i][j] = -(dp[i][j] + dungeon[i][j]);
                }
            }
        }
        return dp[row][col];
    }


}
