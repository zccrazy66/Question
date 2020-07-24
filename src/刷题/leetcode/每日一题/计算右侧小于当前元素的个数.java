package 刷题.leetcode.每日一题;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-11 10:55
 **/
public class 计算右侧小于当前元素的个数 {
    public List<Integer> countSmaller(int[] nums) {
        if (nums == null){
            return null;
        }
        int length = nums.length;
        List<Integer> list = new ArrayList<>();
        int[] dp = new int[length];

        for (int i = 0; i < length; i++) {

        }

        return null ;
//        gun 暴力法
//        List<Integer> res = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            int count = 0;
//            for (int j = i; j < nums.length ; j++) {
//                if (nums[i] > nums[j]){
//                    count++;
//                }
//            }
//            res.add(count);
//        }
//
//        return res;
    }

}
