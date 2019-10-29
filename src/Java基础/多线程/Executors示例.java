package Java基础.多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executors示例 extends Thread {

    private int index;
    public Executors示例(int i){
        this.index = i;
    }

    public void run(){
        try {
            System.out.println("["+this.index+"] start....");
            Thread.sleep((int)(Math.random()*10000));
            System.out.println("["+this.index+"] end..");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.execute(new Executors示例(i));
        }
        System.out.println("submit finish");
        service.shutdown();

    }

}
