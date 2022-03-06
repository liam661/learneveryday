package liam.year22.march.w1.d7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/6 19:16
 **/
class SingleTask implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行... ...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"执行完毕");
    }
}
public class SingleThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Runnable task1 = new SingleTask();
        Runnable task2 = new SingleTask();
        Runnable task3 = new SingleTask();
        pool.execute(task1);
        pool.execute(task2);
        pool.execute(task3);
        pool.shutdown();
    }
}
