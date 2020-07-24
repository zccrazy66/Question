package 刷题.leetcode.每日一题;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/** leetcode 912 **/


public class 排序数组 {

    public int[] sortArray(int[] nums) {
        List<Integer> list = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        list.sort(Comparator.naturalOrder());
        int [] res = new int[nums.length];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

}
