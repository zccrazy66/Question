package 刷题.leetcode.数组;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-17 20:22
 **/
public class 移动零 {

    public void moveZeroes(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != 0){
                continue;
            }else {
                temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }
        }

    }
}
