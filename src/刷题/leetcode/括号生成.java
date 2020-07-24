package 刷题.leetcode;

import java.util.*;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-08 12:06
 **/
public class 括号生成 {

    public List<String> generateParenthesis(int n) {
        if(n <= 0){
            return null;
        }
        List<String> list = new ArrayList();

        dfs("",n,n,list);
        return list;
    }

    private static void dfs(String in, int left, int right, List<String> list){
        if (left == 0 && right == 0){
            list.add(in);
            return;
        }
        if (left > right){
            return;
        }

        if (left > 0){
            dfs(in + '(' ,left - 1, right, list);
        }

        if (right > 0){
            dfs(in + ')',left, right - 1, list);
        }
    }

}
