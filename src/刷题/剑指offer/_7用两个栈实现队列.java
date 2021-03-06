package 刷题.剑指offer;


import java.util.Stack;

/**
 * 题目： 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */


public class _7用两个栈实现队列 {

    // 在pop里做

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
//        stack2.push(stack1.pop());
    }

    public int pop() {

        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();

    }
}
