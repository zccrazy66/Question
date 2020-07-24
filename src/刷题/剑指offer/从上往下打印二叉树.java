package 刷题.剑指offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class 从上往下打印二叉树 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList list = new ArrayList();
        if (root == null){return null;}
        Deque<TreeNode> deque = new LinkedList<TreeNode>();
        deque.add(root);
        while (!deque.isEmpty()){
            TreeNode t = deque.pop();
            list.add(t.val);
            if (t.left!=null){
                deque.add(t.left);
            }
            if (t.right!=null){
                deque.add(t.right);
            }
        }
        return list;
    }
}
