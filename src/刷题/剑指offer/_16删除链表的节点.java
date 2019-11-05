package 刷题.剑指offer;

/**
 *  题目：在O(1) 时间内删除链表节点
 *
 *  给定单向链表的头指针和一个节点指针，定义一个函数在O(1)时间内删除该节点。
 *
 */


public class _16删除链表的节点 {

    public ListNode delete(ListNode head, ListNode pToBeDeleted){


        if(head == null ||pToBeDeleted == null) return head;

        if(head.next==null&&pToBeDeleted==head) head = null;

        if(pToBeDeleted.next!=null){
            pToBeDeleted.val = pToBeDeleted.next.val;
            pToBeDeleted.next = pToBeDeleted.next.next;
        }else{
            ListNode node = head;
            while(node.next.next!=null){
                node=node.next;
            }
            node.next=null;
        }
        return head;




    }


}
