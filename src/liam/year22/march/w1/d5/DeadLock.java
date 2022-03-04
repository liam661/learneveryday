package liam.year22.march.w1.d5;

/**
 * @Description
 * 一个简单的死锁类
 * t1先运行，这个时候flag==true,先锁定obj1,然后睡眠1秒钟
 * 而t1在睡眠的时候，另一个线程t2启动，flag==false,先锁定obj2,然后也睡眠1秒钟
 * t1睡眠结束后需要锁定obj2才能继续执行，而此时obj2已被t2锁定
 * t2睡眠结束后需要锁定obj1才能继续执行，而此时obj1已被t1锁定
 * t1、t2相互等待，都需要得到对方锁定的资源才能继续执行，从而死锁。
 * @Author liam661
 * @Date 2022/3/4 16:08
 **/
public class DeadLock implements Runnable{
    private static Object obj1 = new Object();
    private static Object obj2 = new Object();
    private boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag == true){
            System.out.println(Thread.currentThread().getName()+"开始执行");
            synchronized (obj1){
                System.out.println(Thread.currentThread().getName()+"锁住了obj1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2){
                    System.out.println(Thread.currentThread().getName()+"线程执行完成");
                }
            }
        }
        if(flag == false){
            System.out.println(Thread.currentThread().getName()+"开始执行");
            synchronized (obj2){
                System.out.println(Thread.currentThread().getName()+"锁住了obj2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1){
                    System.out.println(Thread.currentThread().getName()+"线程执行完成");
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DeadLock(true),"thread1");
        Thread t2 = new Thread(new DeadLock(false),"thread2");
        t1.start();
        t2.start();
    }
}
