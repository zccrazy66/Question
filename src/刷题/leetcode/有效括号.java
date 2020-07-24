package 刷题.leetcode;

import java.util.Stack;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-08 10:59
 **/
public class 有效括号 {


    public boolean isValid(String s) {
        if (s.length() % 2 == 1)
            return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char theChar = s.charAt(i);
            if (theChar == '(' || theChar == '{' || theChar == '[')
                stack.push(theChar);
            else {
                if (stack.empty())
                    return false;
                char preChar = stack.peek();
                if ((preChar == '{' && theChar == '}') || (preChar == '(' && theChar == ')') || (preChar == '[' && theChar == ']'))
                    stack.pop();
                else return false;
            }
        }
        return stack.empty();
    }



}
