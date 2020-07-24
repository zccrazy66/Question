package 刷题.leetcode.每日一题;

public class 打印从1到最大的n位数 {

    public int[] printNumbers(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            num = 10*num;
        }

        int[] res = new int[num];
        for (int i = 1; i <= res.length; i++) {
            res[i] = i;
        }
        return res;
    }

}
