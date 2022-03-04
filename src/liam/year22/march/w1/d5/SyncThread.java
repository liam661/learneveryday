package liam.year22.march.w1.d5;
/**
 * @Description
 * 循环依赖产生死锁
 * 产生三个线程 a，b,c
 * a 锁住 1，请求 2
 * b 锁住 2，请求 3
 * c 锁住 3，请求 1
 * @Author liam661
 * @Date 2022/3/4 16:23
 **/
public class SyncThread implements Runnable{
    private Object obj1;
    private Object obj2;

    public SyncThread(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始执行");
        synchronized (obj1){
            System.out.println(Thread.currentThread().getName()+"获取到了"+obj1);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj2){
                System.out.println(Thread.currentThread().getName()+"获取到了"+obj2);
            }
        }
    }

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        Object obj3 = new Object();
        Thread t1 = new Thread(new SyncThread(obj1,obj2),"t1");
        Thread t2 = new Thread(new SyncThread(obj2,obj3),"t2");
        Thread t3 = new Thread(new SyncThread(obj3,obj1),"t3");
        t1.start();
        t2.start();
        t3.start();
    }

}
