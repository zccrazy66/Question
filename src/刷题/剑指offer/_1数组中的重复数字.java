package 刷题.剑指offer;

/**
 * 数组中的重复数字：
 * 在一个长度为n的数组里的所有数组都在0~n-1的范围内，数组中的一些数字是重复的
 * 不知道是几个，也不知道重复了几次。请找出数组中任意一个重复数字
 *
 * 输入：{2，3，1，0，2，5，3}
 *
 * 输出：2 、 3
 *
 */



public class _1数组中的重复数字 {

    /**
     * 思路：类似于 hashmap
     * 记录扫过的数，如果再出现就判断为重复；（暴力法O（n2） 此方法一趟遍历）
     *
     * @param numbers
     * @param length
     * @param duplication
     * @return
     */


    public boolean duplicate(int numbers[],int length,int [] duplication) {

        int[] compare = new int[length];
        for(int i=0; i<length; i++){
            if(compare[numbers[i]] == 0){
                // 记录状态
                compare[numbers[i]]++;
            }else{
                duplication[0] = numbers[i];
                return true;
            }
        }

        duplication[0] = -1;
        return false;
    }



}



