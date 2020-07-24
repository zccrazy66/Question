package 刷题.leetcode.每日一题;

import java.util.Scanner;
import java.util.Stack;

public class 翻转字符串里的单词 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(reverseWords(s));
    }


    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        s = clean(s);
        String a;
        int k = 0; // 记录位置
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' '){
                a = s.substring(k,i+1);
                stack.push(a);
                k = i+1;
            }
        }
        String res = stack.pop() + " ";
        while (!stack.isEmpty()){
            res +=stack.pop();
        }
        System.out.println(res);
        return clean(res.substring(0,res.length()-1));
    }

    private static String clean(String s){
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) != ' '){
                s = s.substring(j);
                break;
            }
        }
        return s;
    }
}
