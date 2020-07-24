package 刷题.剑指offer;


/**
 * 题目描述
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */


public class 树的子结构 {


    public boolean HasSubtree(TreeNode root1,TreeNode root2) {

        if (root1 == null || root2 == null){
            return false;
        }

        boolean result = false;


        if (root1.val == root2.val){
            result =  judge(root1, root2);
        }

        if(!result){
            result = judge(root1.left,root2);
        }

        if (!result){
            result = judge(root1.right,root2);
        }

        return result;
    }


    public boolean judge(TreeNode root1, TreeNode root2){
        if (root1 == null){
            return false;
        }
        if (root2 == null){
            return true;
        }
        if (root1.val != root2.val){
            return false;
        }
        return judge(root1.left,root2.left)&&judge(root1.right, root2.right);
    }





}
