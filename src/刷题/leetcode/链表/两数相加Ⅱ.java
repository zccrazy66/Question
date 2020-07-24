package 刷题.leetcode.链表;

import java.util.Stack;

public class 两数相加Ⅱ {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int add = 0;
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();
        while (l1.next!=null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2.next!=null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode res = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || add>0){
            int sum = add;
            sum += stack1.isEmpty()? 0: stack1.pop();
            sum += stack2.isEmpty()? 0: stack2.pop();
            ListNode mid = new ListNode(sum%10);
            mid.next = res;
            res = mid;
            add = sum/10;
        }
        return res;
    }

}
