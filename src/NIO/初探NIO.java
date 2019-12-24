package NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Selector;

/**
 * 非阻塞式 IO （NIO）
 * 核心： Channel：负责传输
 *       Buffer ：负责存储
 *       Selector：选择器，管理多个网络连接，它可以检测一到多个channel，
 *                 并且可以知道通道是否为独写事件做好准备。
 */



public class 初探NIO {

    public static void main(String[] args) {

        /**
         *  玩一下 buffer 区
         */

        String str = "abcde";
        // 分配了容量为10的缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(10);
        // 容量
        int capacity = byteBuffer.capacity();
        // 位置
        int position = byteBuffer.position();
        // 限制
        int limit = byteBuffer.limit();

        System.out.println("capacity is " + capacity);
        System.out.println("posiotion is " + position);
        System.out.println("limit is " + limit);

        byteBuffer.put(str.getBytes());

        capacity = byteBuffer.capacity();
        position = byteBuffer.position();
        limit = byteBuffer.limit();

        System.out.println("put 完的这几个值查看");
        System.out.println("capacity is " + capacity);
        System.out.println("posiotion is " + position);
        System.out.println("limit is " + limit);
        // 切换为读取模式
        System.out.println(" let's flip it ...");
        byteBuffer.flip();

        capacity = byteBuffer.capacity();
        position = byteBuffer.position();
        limit = byteBuffer.limit();

        System.out.println("flip 完的这几个值查看");
        System.out.println("capacity is " + capacity);
        System.out.println("posiotion is " + position);
        System.out.println("limit is " + limit);


        /**
         * Selector
         */

        try {
            Selector selector = Selector.open();


        } catch (IOException e) {
            e.printStackTrace();
        }


    }




}
