package 刷题.剑指offer;

import java.util.List;

/**
 * 题目： 输入一个链表，反转链表后，输出新链表的表头
 *
 */



public class _XX反转链表 {

    public ListNode ReverseList(ListNode head) {

        if (head == null){
            return null;
        }

        ListNode pre = null;
        ListNode next = null;

        // 知道链表反转完毕
        while (head.next != null){

            next = head.next;
            head.next = pre; // 目的就是让链表指向换了

            pre = head;
            head = next; //进一步


        }

        return pre;


    }

}
