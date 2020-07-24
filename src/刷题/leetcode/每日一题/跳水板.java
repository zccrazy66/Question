package 刷题.leetcode.每日一题;

import java.util.*;

/**
 * @program: Question
 * @description leetcode 面试题16.11 https://leetcode-cn.com/problems/diving-board-lcci/
 * @author: zc
 * @create: 2020-07-08 10:30
 **/
public class 跳水板 {

    class Solution {
        public int[] divingBoard(int shorter, int longer, int k) {
            if (k == 0) {
                return new int[0];
            }
            if (shorter == longer) {
                return new int[]{shorter * k};
            }
            int[] lengths = new int[k + 1];
            for (int i = 0; i <= k; i++) {
                lengths[i] = shorter * (k - i) + longer * i;
            }
            return lengths;
        }
    }


}
