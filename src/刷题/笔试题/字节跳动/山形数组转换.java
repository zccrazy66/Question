package 刷题.笔试题.字节跳动;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-18 19:36
 **/
public class 山形数组转换 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input_line = in.nextLine();
        String[] input = input_line.split(",");
        int[] temp = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            temp[i] = Integer.parseInt(input[i]);
        }

        int[] res = change(temp);
        for (int re : res) {
            System.out.print(re + ", ");
        }
    }

    private static int[] change(int[] temp){

        int length = temp.length;
        int k = 1;
        for (int i = 1; i <length; i++) {

            if (temp[i] != temp[i-1]){
                temp[k] = temp[i];
                k++;
            }
        }

        for (int i1 : temp) {
            System.out.print(i1 + ", ");
        }

        System.out.println(" ");


        int left = 0;
        int right = k-1;


        while (left<=right) {
            if (temp[left] == temp[right]){
                left++;
                right--;
            }else if (temp[left] > temp[right]){
                int mid= temp[right];
                temp[right] = temp[left];
                temp[left] = mid;
                left++;
            }else {
                right--;
            }
        }
        return temp;
    }



}
