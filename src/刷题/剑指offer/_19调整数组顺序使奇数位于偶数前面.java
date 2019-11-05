package 刷题.剑指offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 题目：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 *      使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 *      并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */

public class _19调整数组顺序使奇数位于偶数前面 {

    public void reOrderArray(int [] array) {

//        我的做法
        int count = 0;

        List<Integer> jishu = new ArrayList<Integer>();
        List<Integer> oushu = new ArrayList<Integer>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                oushu.add(array[i]);
            }else {
                jishu.add(array[i]);
            }

        }

        for (int i = 0; i < jishu.size(); i++) {
            array[count] = jishu.get(i);
            count++;
        }

        for (int i = 0; i < oushu.size(); i++) {
            array[count] = oushu.get(i);
            count++;
        }



    }


}
