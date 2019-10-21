package 设计模式;

/**
 * 单例设计模式： 保证一个类在内存中的对象唯一性。
 *
 * 方式： 1、不允许其他程序使用new创建该对象。
 *       2、在这个类中创建一个本例实例。
 *       3、 对外提供一个方法让其他程序可以获取该对象。
 */


class Single{
    // 在自己类中就初始化对象
    private static Single s = new Single();
    private Single(){}
    public static Single getInstance(){
        return s;
    }
}


public class 单例设计模式 {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        System.out.println(s1);
    }
}
