package 刷题.剑指offer;

/**
 * 题目： 输入数字 n ，按顺序打印出从1到最大n位十进制数。
 *
 * 示例： 输入 3 ，则打印1、2、3 直到最大3位数 999
 *
 */



public class _15打印从1到最大的n位数_未验证 {

    public int print(int n){

        int count = 1;
        for (int i = 1; i < Math.pow(10,n) ; i++) {
            count *= i;
        }

        return count;


    }



}
