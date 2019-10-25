package Java基础;


import java.util.concurrent.*;

/**
 *
 * 线程池的作用：管理线程、避免增加创建线程和摧毁线程的资源损耗
 *              提高响应速度，就任务到达，直接去线程池里拿线程。
 *              重复利用。 线程用完就放回去        这就是封装。
 *
 * 1、Executor 线程池的顶级接口，只有一个执行任务方法 execte()
 * 2、ExecutorService 是 Executor 的子接口，包含了一些线程池常用的方法
 *
 */



public class 线程池 {

//    ThreadPoolExecutor()

//    Future
    public static void main(String[] args) {


        // 创建单一线程池
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            final int task = i;
            threadPool.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 10; j++) {
                        System.out.println(Thread.currentThread().getName()
                                + "is looping of" + j + " for task of " + task);
                    }
                }
            });
        }

        System.out.println("all of 10 tasks have committed");




    }










}
