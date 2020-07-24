package 刷题.笔试题.网易;

import java.util.Scanner;

public class 牛牛的等差数列 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] x = new int[length];
        for (int i = 0; i < x.length; i++) {
            x[i] = in.nextInt();
        }
        System.out.println(solution(length, x));
    }
    public static int solution(int length,int[] x){
        int d = x[1] - x[0];
        int [] erfen = new int[x.length];
        for (int i = 0; i < x.length-1; i++) {
            erfen[i] = x[i+1]-x[i];
        }
        return d;
    }



}
