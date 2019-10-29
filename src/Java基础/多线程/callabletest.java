package Java基础.多线程;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/**
 * callable 接口类似于 runnable， 两者都是为了那些其示例可能被另一个线程执行的类设计的
 *
 * 两者的区别是，callable可以返回结果或者抛出异常
 *
 *
 */




class callabledemo implements Callable {

    private int number;

    callabledemo(int number){
        this.number = number;
    }



    @Override
    public Object call() throws Exception {
        int sum  = 0;

        for (int i = 0; i <=number; i++) {
            sum += i;
        }




        return sum;
    }
}


public class callabletest  {




    // 开辟一个线程池
//    ExecutorService pool = Executors.newFixedThreadPool(2);
//    // Future 对象，用来获取返回值或者判断是否结束
//    Future<Integer> future = pool.submit(new SumCallable(10));
//    // 通过future.get 来获取返回值
//    Integer sum = future.get();
//    // 关闭线程池
//    pool.shutdown();

    class SumCallable implements Callable<Integer>{

        private int number;

        SumCallable(int number){
            this.number = number;
        }


        @Override
        public Integer call() throws Exception {

            int sum = 0;
            for (int i=0; i<number; i++){
                sum += i;
            }
            return sum;
        }
    }

}