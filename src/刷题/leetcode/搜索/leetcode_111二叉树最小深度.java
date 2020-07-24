package 刷题.leetcode.搜索;

import 刷题.剑指offer.TreeNode;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-05 15:03
 **/

public class leetcode_111二叉树最小深度 {

    public int minDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        if (root.left == null || root.right == null){
            return 1;
        }

        int min = Integer.MAX_VALUE;
        if (root.left != null){
            min = Math.min(min, minDepth(root.left));
        }if (root.right != null){
            min = Math.min(min, minDepth(root.right));
        }
        return min;
    }

}
