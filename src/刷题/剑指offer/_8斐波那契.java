package 刷题.剑指offer;

/**
 * 题目： 就是斐波那契
 */



public class _8斐波那契 {
    public int Fibonacci(int n) {

        // 迭代写法

        int a = 0;
        int b = 1;
        int res = 0;
        if(n == 0) return 0;
        if(n == 1) return 1;

        for(int i= 1; i<n; i++){
            res = a+b;
            a = b;
            b = res;

        }
        return res;

    }
}
