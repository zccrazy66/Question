package 题.剑指offer;



/**
 * 题目：输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 *
 * 输入：前序遍历序列{1,2,4,7,3,5,6,8}
 *      中序遍历序列{4,7,2,1,5,3,8,6}
 */





public class _5重建二叉树 {

    // 思路 ：递归; 注意前序遍历和中序遍历定义

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {

        TreeNode root = reConstructBinaryTree(pre, 0, pre.length-1, in, 0, in.length-1);
        return root;

    }

    private TreeNode reConstructBinaryTree(int[] pre, int start_pre, int end_pre, int[] in, int start_in, int end_in){

        //特殊情况
        if (start_pre > end_pre || start_in > end_in){
            return null;
        }

        TreeNode root = new TreeNode(pre[start_pre]);

        for (int i=start_in; i <= end_in; i++){
            if (in[i] == pre[start_pre]){
                root.left = reConstructBinaryTree(pre, start_pre+1, start_pre + i-start_in, in, start_in,i-1);
                root.right = reConstructBinaryTree(pre, i-start_in + start_pre + 1, end_pre, in, i + 1, end_in);

                break;
            }
        }
        return root;
    }



}
