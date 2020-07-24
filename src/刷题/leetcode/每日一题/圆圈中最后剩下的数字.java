package 刷题.leetcode.每日一题;

import java.util.ArrayList;
import java.util.List;

/** leetcode 面试题62 **/


public class 圆圈中最后剩下的数字 {
    public int lastRemaining(int n, int m) {
        int ans = 0;
        // 最后一轮剩下2个人，所以从2开始反推
        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}
