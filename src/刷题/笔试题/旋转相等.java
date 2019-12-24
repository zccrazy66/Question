package 刷题.笔试题;


import java.util.Scanner;

/**
 *
 * 给定两个字符串，A和B。A的旋转操作就是把最左边字符移动到最右边
 * 输入 abcde cdeab
 * 输出 True
 *
 */

public class 旋转相等 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(judge(str1, str2));

    }

    private static String judge(String str1 , String str2){

        if (str1.length() != str2.length()){
            return "False";
        }

        for (int i = 0; i < str1.length(); i++) {

            if (str1.equals(str2)){
                return "True";
            }
            str1 = str1.substring(1) + str1.substring(0,1);
        }
        return "False";
    }



}
