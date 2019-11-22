package 刷题.leetcode;

/**
 * 题目：给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 *      如果不存在最后一个单词，请返回 0 。
 *
 * 示例：输入: "Hello World"
 *      输出: 5
 *
 */


public class 最后一个单词的长度 {

    public int lengthOfLastWord(String s) {
        int length = s.length();
        int end = length - 1;
        while (end>0 && s.charAt(end) == ' '){
            end--;
        }
        int start = end;
        while (start>0 && s.charAt(start)!=' '){
            start--;
        }
        return end-start;
    }

    public static void main(String[] args) {
        最后一个单词的长度 test = new 最后一个单词的长度();
        System.out.println( test.lengthOfLastWord("a "));
    }
}
