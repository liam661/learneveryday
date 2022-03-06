package liam.year22.march.w1.d7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/6 18:50
 **/
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int x = 0; x < 100; x++){
            System.out.println(Thread.currentThread().getName()+": "+ x);
        }
    }
}

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.submit(new MyRunnable());
        pool.submit(new MyRunnable());
        pool.shutdown();
    }
}
