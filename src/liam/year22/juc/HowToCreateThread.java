package liam.year22.juc;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * @Description 如何创建多线程
 * @Author liam661
 * @Date 2022/2/4 17:07
 **/
public class HowToCreateThread{
    // f1: 继承thread 方法
    private static class ThreadMethod extends Thread{
        @Override
        public void run(){
            for(int i = 0; i < 10;i++){
                try {
                    TimeUnit.MICROSECONDS.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("T1");
            }
        }
    }
    // f2: 实现 runable接口
    private static class RunableMethod implements Runnable{
        @Override
        public void run() {
            for(int i = 0; i < 10; i++){
                try{
                    TimeUnit.MICROSECONDS.sleep(1);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("T2");
            }
        }
    }
    public static void main(String [] args){
         //ThreadMethod thread = new ThreadMethod();
         //thread.start();
         Thread thread2 = new Thread(new RunableMethod());
         thread2.start();
    }
}
