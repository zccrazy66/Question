package 刷题.leetcode.数组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 题目：给定一个数组，判断nums中是否存在三个元素a,b,c，使得a+b+c=0 ?
 * 
 * 输入：nums = [-1, 0, 1, 2, -1, -4]
 * 
 */




public class 三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        int length = nums.length;
        if (nums == null || length < 3){
            return lists;
        }
        Arrays.sort(nums);
        for (int i = 0; i < length; i++) {
            if (nums[i] > 0){
                break;
            }
            if (i > 0 && nums[i] == nums[i-1]) continue; // 去重

            int L = i+1; // left
            int R = length - 1; // right

            while (L < R){
                int sum = nums[i] + nums[R] + nums[L];

                if (sum == 0){
                    lists.add(Arrays.asList(nums[i], nums[R], nums[L]));
                    while (L < R && nums[L] == nums[L+1]) L++; // 去重
                    while (L < R && nums[R] == nums[R-1]) R--; // 去重
                    L++;
                    R--;
                }
                else if (sum < 0) L++;
                else if (sum > 0) R--;
            }
        }
        return lists;
    }

}
