package 刷题.leetcode.二叉树;

import sun.reflect.generics.tree.Tree;
import 刷题.剑指offer.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-09 12:48
 **/
public class 二叉树的层序遍历 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();

        Queue<TreeNode> queue1 = new LinkedList<>();
        queue1.offer(root);

        while (!queue1.isEmpty()){
            List<Integer> num = new ArrayList<>();
            int n = queue1.size();
            for (int i = 0; i < n; i++) {
                TreeNode thenew = queue1.poll();
                num.add(thenew.val);
                if (thenew.left!=null){
                    queue1.add(thenew.left);
                }
                if (thenew.right != null){
                    queue1.add(thenew.right);
                }
            }

            lists.add(num);
        }

        return lists;




    }

}
