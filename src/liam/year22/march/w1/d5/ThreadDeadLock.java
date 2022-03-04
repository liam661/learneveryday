package liam.year22.march.w1.d5;

/**
 * @Description
 * 模拟线程死锁的产生条件
 * 哲学家问题
 * @Author liam661
 * @Date 2022/3/4 15:13
 **/
public class ThreadDeadLock implements Runnable{
    private int flag = 1;
    private static Object obj1 = new Object();
    private static Object obj2 = new Object();

    @Override
    public void run() {
        System.out.println("flag :"+flag);
        if(flag == 1){
            synchronized (obj1){
                System.out.println("我已经锁定obj1，休息0.5秒后去锁定obj2去！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj2){
                    System.out.println("1");
                }
            }
        }
        if(flag == 0){
            synchronized (obj2){
                System.out.println("我已经锁定了obj2，休息0.5秒后锁定obj1去！");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj1){
                    System.out.println("0");
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadDeadLock run01 = new ThreadDeadLock();
        ThreadDeadLock run02 = new ThreadDeadLock();
        run01.flag = 1;
        run02.flag = 0;
        Thread thread01 = new Thread(run01);
        Thread thread02 = new Thread(run02);
        System.out.println("线程开始了");
        thread01.start();
        thread02.start();
    }
}
