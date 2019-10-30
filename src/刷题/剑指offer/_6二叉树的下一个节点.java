package 刷题.剑指offer;

/**
 * 题目： 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意： 树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class _6二叉树的下一个节点 {

    /**
     *  首先要明确中序遍历的概念，左 -> 根 -> 右
     *
     *  所以，首先要去看是否存在右节点，如果有右节点，那么下一个节点肯定是已右节点为根的这个子树里边。
     *  如果步存在右节点，那么要往上去找，也就是去找本节点的上级，这个就是下一节点。
     *
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {

        if (pNode == null){
            return pNode;
        }

        if (pNode.right != null ){
            pNode = pNode.right;
            while (pNode.left != null){
                pNode = pNode.left;
            }
            return pNode;
        }


        while (pNode.next != null){
            if (pNode.next.left == pNode){return pNode.next;}
            pNode = pNode.next;
        }

        return null;


    }

}
