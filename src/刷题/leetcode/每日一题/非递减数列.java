package 刷题.leetcode.每日一题;


/** leetcode 665 */

public class 非递减数列 {

    public boolean checkPossibility(int[] nums) {

        int point = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]){
                point++;
            }
        }
        if (point>1){
            return false;
        }
        return true;
    }





}
