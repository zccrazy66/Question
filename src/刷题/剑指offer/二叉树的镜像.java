package 刷题.剑指offer;

public class 二叉树的镜像 {

    public void Mirror(TreeNode root) {
        if (root == null){
            return;
        }
        if (root.left == null && root.right ==null){
            return;
        }

        TreeNode mid = root.left;
        root.left = root.right;
        root.right = mid;

        if (root.left!=null){
            Mirror(root.left);
        }
        if (root.right!=null){
            Mirror(root.right);
        }
    }

}
