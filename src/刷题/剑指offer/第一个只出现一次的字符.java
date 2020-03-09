package 刷题.剑指offer;

/**
 * 题目描述
 * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
 * 如果没有则返回 -1（需要区分大小写）.
 */



public class 第一个只出现一次的字符 {

    public static int FirstNotRepeatingChar(String str) {
        char[] a = str.toCharArray();
        char count;
        int flag = 0;
        int result = -1;
        for (int i = 0; i < a.length; i++) {
            count = a[i];
            for (int j = 0; j <a.length; j++) {
                if (count == a[j]) {
                    flag++;
                }
            }
            if (flag == 1){
                result = i;
                break;
            }
            flag = 0;
        }
        return result;
    }


    public static void main(String[] args) {
        FirstNotRepeatingChar("google");
        System.out.println(FirstNotRepeatingChar("google"));
    }



}
