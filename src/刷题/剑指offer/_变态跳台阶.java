package 刷题.剑指offer;

/**
 *  题目描述
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法
 *
 * 思路 除了最后落地的那个台阶，每个台阶都有两种可能，跳或者不跳...
 *
 */



public class _变态跳台阶 {

    public int JumpFloorII(int target) {

        if (target <= 0){return 0;}
        if (target == 1 ) {return 1;}

        int a = 1;
        int b = 2;
        for (int i = 2; i < target; i++) {
            b = a*2;
            a = b;
        }

        return b;


    }



}
