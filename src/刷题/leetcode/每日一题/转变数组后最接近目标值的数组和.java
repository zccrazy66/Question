package 刷题.leetcode.每日一题;

import java.util.Scanner;

/**
 * leetcode 1300
 */


public class 转变数组后最接近目标值的数组和 {

    public int findBestValue(int[] arr, int target) {
        int yushu = target%arr.length;
        if (yushu == 0){
            return target/arr.length;
        }
        int sum = 0;
        int res = Math.abs(target - arr[0]*arr.length);
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += arr[j];
            }
            sum += arr[i]*(arr.length - i);
            if (res > target-sum){
                num = i;
            }
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);



    }


}
