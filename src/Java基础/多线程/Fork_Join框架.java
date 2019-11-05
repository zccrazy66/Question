package Java基础.多线程;

import java.util.concurrent.RecursiveAction;

/**
 * Fork/Join 框架
 * 作用： 把大任务分割成若干个小任务，最终汇总小任务结果得到大任务结果
 *
 * Fork ： 切分
 * Join ： 合并
 *
 */

//
//
//
//public class Fork_Join框架 extends RecursiveAction<Integer> {
//
//    private static final int THRESHOLD = 2; // 阈值
//    private int start;
//    private int end;
//
//    Fork_Join框架(int start, int end){
//        this.start = start;
//        this.end = end;
//    }
//
//
//    @Override
//    protected Integer compute() {
//
//    }
//}
