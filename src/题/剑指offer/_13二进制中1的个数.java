package 题.剑指offer;

/**
 * 题目：输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 */


public class _13二进制中1的个数 {

    public int NumberOf1(int n) {



        // 神仙方法
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;

        //常规写法
//        int count = 0;
//        int flag = 1;
//        while (flag != 0){
//            if ((n & flag) != 0){
//                count ++;
//            }
//            flag = flag << 1;
//        }
//        return count;


        // SB 方法 wdnmd
//        int num = 0;
//        if (n == 0) return 0;
//
//        String a = Integer.toBinaryString(n);
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == '1'){
//                num++;
//            }
//        }
//
//        return num;


    }
}
