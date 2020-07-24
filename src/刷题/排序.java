package 刷题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 排序 {

    public static void main(String[] args) {


        List list = new ArrayList();


        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int[] count = new int[number];
        for (int i = 0; i < number; i++) {
            count[i] = in.nextInt();
        }
//        System.out.println(Arrays.toString(maopao(count)));
    }


    // 冒泡排序
    private static int[] maopao(int[] count){
        for (int i = 0; i < count.length; i++) {
            for (int j = 1; j < count.length - i; j++) {
                if (count[j] < count[j-1]){
                    int temp = count[j-1];
                    count[j-1] = count[j];
                    count[j] = temp;
                }
            }
        }
        return count;
    }


    // 快速排序
//    private static int[] kaisu(int[] count){
//
//    }





}
