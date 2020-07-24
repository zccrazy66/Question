package 刷题.leetcode.每日一题;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/** leetcode 56 */



public class 合并区间 {
    public int[][] merge(int[][] intervals) {
        int len = intervals.length;
        if (len < 1) return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> list = new ArrayList<>(len);
        for (int i = 0; i < len - 1; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i + 1][0] = intervals[i][0];
                intervals[i + 1][1] = Math.max(intervals[i + 1][1], intervals[i][1]);
            } else list.add(intervals[i]);
        }
        list.add(intervals[len - 1]);
        return list.toArray(new int[list.size()][2]);
    }
}
