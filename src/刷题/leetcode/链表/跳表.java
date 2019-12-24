package 刷题.leetcode.链表;

import java.util.Random;

/**
 * 跳表的节点，包括 key-value 和上下左右4个指针
 */

class SkipListNode<T>{

    public int key;
    public T value;
    public SkipListNode<T> up, down, left, right;

    public static final int HEAD_KEY = Integer.MIN_VALUE;
    public static final int TAIL_KEY = Integer.MAX_VALUE;

    public SkipListNode(int k, T v){
        key = k;
        value = v;
    }

    public int getKey() {
        return key;
    }
    public void setKey(int key){
        this.key = key;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public boolean equals(Object o) {
        if (this==o) {
            return true;
        }
        if (o==null) {
            return false;
        }
        if (!(o instanceof SkipListNode<?>)) {
            return false;
        }
        SkipListNode<T> ent;
        try {
            ent = (SkipListNode<T>)  o; // 检测类型
        } catch (ClassCastException ex) {
            return false;
        }
        return (ent.getKey() == key) && (ent.getValue() == value);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "key-value:"+key+"-"+value;
    }
}


public class 跳表<T> {

    private SkipListNode<T> head,tail;
    private int nodes; // 节点数
    private int listlevel; // 层数
    private Random random; // 随机数，投硬币上层数
    private static final double PROBABILITY = 0.5; // 向上提升一层的概率

    public 跳表(){
        random = new Random();
        clear();
    }

    /**
     * 清空跳表
     */
    public void clear(){
        head = new SkipListNode<>(SkipListNode.HEAD_KEY, null);
        tail = new SkipListNode<>(SkipListNode.TAIL_KEY, null);

//        horizon

        listlevel = 0;
        nodes = 0;
    }

    public boolean isEmpty(){
        return nodes == 0;
    }

    public int size(){
        return nodes;
    }

//    private SkipListNode










}
