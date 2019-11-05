package 刷题.笔试题;


import java.util.Arrays;
import java.util.Scanner;

/**
 * 小Q有n个数字，每次小Q可以选择任意两个不相同的数字，并同时删去它们
 * 问是否可以删完
 *
 *输入
 * 1                //一组数据
 * 6                //6个数
 * 1 2 3 4 5 6      //数组
 *
 * 输出
 * yes
 *
 */

public class tx_删除数 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i = in.nextInt();

        while (i>0){
            int num = in.nextInt();
            int[] z = new int[num];
            for (int q = 0; q<num; q++){
                z[q] = in.nextInt();
            }

            Arrays.sort(z);

            if (z[num/2] != z[num/2-1]){
                System.out.println("yes");
//                return;
            }else {
                System.out.println("no");
//                return;
            }

            i--;
//            System.out.println(Arrays.toString(z));
        }



    }

//    private static String solution(int i, int[] a){
//
//
//
//    }

}
