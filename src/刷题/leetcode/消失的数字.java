package 刷题.leetcode;

import java.util.Arrays;

public class 消失的数字 {
    public int missingNumber(int[] nums) {
        // sb 做法
//        Arrays.sort(nums);
//        int lost = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]!=i){
//                lost = i;
//                break;
//            }
//            lost++;
//        }
//        return lost;

        int sum = nums.length*(nums.length+1)/2;
        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }
        return sum;
    }
}
