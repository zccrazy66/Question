package Java基础.多线程;



// 1、实现Runnable接口

//class Mytread implements Runnable{
//
//    public void run(){
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + "..." + i);
//        }
//    }
//
//
//}

//class seesee extends Thread{
//
//}


// 2、 实现Callable接口
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//class MyCallable implements Callable{
//
//    @Override
//    public Object call() throws Exception {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(Thread.currentThread().getName() + ":" + i);
//        }
//        return null;
//    }
//}

//class test implements Runnable{
//
//    @Override
//    public void run(){
//        for (int i = 0; i < 5; i++) {
//            System.out.println("the thread is..." + i);
//        }
//    }
//
//}
//class YieldThread extends Thread {
//    // 定义一个有参的构造方法
//    public YieldThread(String name) {
//        super(name); // 调用父类的构造方法
//    }
//    public void run() {
//        for (int i = 0; i < 6; i++) {
//            System.out.println(Thread.currentThread().getName() + "---" + i);
//            if (i == 3) {
//                System.out.print("线程让步:");
//                Thread.yield(); // 线程运行到此，作出让步
//            }
//        }
//    }
//}

class Student {
    String name;
    int age;
    boolean flag;
}

class SetThread implements Runnable {
    private Student s;

    private int x = 0;

    public SetThread(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (s) {
                if (s.flag) {
                    try {
                        s.wait(); // t1等着，释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                if (x % 2 == 0) {
                    s.name = "张三";
                    s.age = 15;
                } else {
                    s.name = "李四";
                    s.age = 16;
                }
                x++; // x=1

                // 修改标记
                s.flag = true;
                // 唤醒线程
                s.notify(); // 唤醒t2,唤醒并不表示你立马可以执行，必须还得抢CPU的执行权。
            }
        }
    }
}

class GetThread implements Runnable {
    private Student s;

    public GetThread(Student s) {
        this.s = s;
    }

    public void run() {
        while (true) {
            synchronized (s) {
                if (!s.flag) {
                    try {
                        s.wait(); // t2就等待了。立即释放锁。将来醒过来的时候，是从这里醒过来的时候
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println(s.name + "--  --" + s.age);
                // 林青霞---27
                // 刘意---30

                // 修改标记
                s.flag = false;
                // 唤醒线程
                s.notify(); // 唤醒t1
            }
        }
    }
}










//
// 使用 lock 完成线程同步
//class Ticket implements Runnable{
//    private int ticket = 10;
//
//    private Lock lock = new ReentrantLock();
//
//    public void run(){
//        try {
//            lock.lock();
//            if (ticket > 0){
//                try {
//                    Thread.sleep(100);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//                System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) +"张票");
//            }
//
//        }finally {
//            lock.unlock();
//        }
//    }
//
//}





public class 多线程示例 {
    public static void main(String[] args) {
        // 创建资源
        Student s = new Student();

        // 设置和获取的类
        SetThread st = new SetThread(s);
        GetThread gt = new GetThread(s);

        // 线程类
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(gt);

        // 启动线程
        t1.start();
        t2.start();
    }
}
