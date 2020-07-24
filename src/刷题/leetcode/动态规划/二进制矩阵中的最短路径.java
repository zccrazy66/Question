package 刷题.leetcode.动态规划;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-24 10:06
 **/
public class 二进制矩阵中的最短路径 {

        private static int[][] directions = {{0,1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {-1, -1}, {-1, 0}, {-1, 1}};
        private int row, col;
        public int shortestPathBinaryMatrix(int[][] grid) {
            row = grid.length;
            col = grid[0].length;
            if(grid[0][0] == 1 || grid[row - 1][col - 1] == 1) return -1;
            Queue<int[]> pos = new LinkedList<>();
            grid[0][0] = 1; // 直接用grid[i][j]记录从起点到这个点的最短路径长。按照题意 起点也有长度1
            pos.add(new int[]{0,0});

            while(!pos.isEmpty() && grid[row - 1][col - 1] == 0){ // 求最短路径 使用BFS
                int[] xy = pos.remove();
                int preLength = grid[xy[0]][xy[1]]; // 当前点的路径长度
                for(int i = 0; i < 8; i++){
                    int newX = xy[0] + directions[i][0];
                    int newY = xy[1] + directions[i][1];
                    if(inGrid(newX, newY) && grid[newX][newY] == 0){
                        pos.add(new int[]{newX, newY});
                        grid[newX][newY] = preLength + 1; // 下一个点的路径长度要+1
                    }
                }
            }
            return grid[row - 1][col - 1] == 0 ? -1 : grid[row - 1][col - 1]; // 如果最后终点的值还是0，说明没有到达
        }

        private boolean inGrid(int x, int y){
            return x >= 0 && x < row && y >= 0 && y < col;
        }
    }



