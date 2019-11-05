package Java基础.多线程;

/**
 * 死锁是多线程特有的问题，在死锁时，线程间互相等待资源，而不释放自身的资源
 *
 * 出现死锁需要满足的条件：
 *
 * 1、互斥条件 : 一个资源每次只能被一个线程使用
 * 2、请求与保持条件: 一个进程因为请求资源而阻塞时，对以获得的资源保持不放
 * 3、不剥夺条件： 进程已经获得的资源，在未使用完之前，不能强行剥夺
 * 4、循环等待条件： 若干进程之间形成一种头尾相接的循环等待资源的关系
 *
 *
 */

public class 死锁示例 {

//    public static void main(String[] args) throws InterruptedException {
//        Object object1 = new Object();
//        Object object2 = new Object();
//        Object object3 = new Object();
//
//        Thread t1 = new Thread(new )
//
//    }


}
