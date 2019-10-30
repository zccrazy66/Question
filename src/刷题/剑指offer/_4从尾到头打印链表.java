package 刷题.剑指offer;


/**
 *
 * 题目：从尾到头打印链表
 *
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 *
 *
 */

import java.util.ArrayList;
import java.util.Stack;

public class _4从尾到头打印链表 {



    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        if (listNode == null){
            return arr;
        }

        while (listNode != null){
            stack.push(listNode.val);
            // 最开始死循环了，😵
            listNode = listNode.next;
        }

        while (!stack.empty()){
            arr.add(stack.pop());
        }

        return arr;


    }



}
