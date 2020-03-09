package 网络;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *  测试socket编程 （client端）
 *
 */



public class TalkClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",4700);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
