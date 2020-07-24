package 刷题.leetcode.数组;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-17 19:07
 **/
public class 搜索插入位置 {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if (nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                mid = end;
            }else {
                start = mid;
            }
        }
        return mid;
    }
}
