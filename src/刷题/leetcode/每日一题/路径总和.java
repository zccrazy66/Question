package 刷题.leetcode.每日一题;

import 刷题.剑指offer.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-07 15:22
 **/
public class 路径总和 {

    public boolean hasPathSum(TreeNode root, int sum) {
//        if(root == null) {
//            return false;
//        }
//        int count = root.val;
//        if (root.left == null && root.right == null){
//            return count == sum;
//        }else {
//            return hasPathSum(root.left,sum-count) || hasPathSum(root.right,sum-count);
//        }

        // 宽搜
        if (root == null) return false;

        // 两个队列用来记录加数和节点
        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        queue1.offer(root);
        queue2.offer(root.val);

        while (!queue1.isEmpty()){
            TreeNode now = queue1.poll();
            int num = queue2.poll();
            if (now.left == null && now.right == null){
                if (num == sum){
                    return true;
                }
                continue;
            }
            if (now.left != null){
                queue1.offer(now.left);
                queue2.offer(now.left.val + num);
            }
            if (now.right != null){
                queue1.offer(now.right);
                queue2.offer(now.right.val + num);
            }
        }
        return false;
    }


}
