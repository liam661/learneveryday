package liam.year22.juc;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/5 18:29
 **/
public class BadSuspend {
    public static Object u = new Object();

    public static class ChangeObjectThread extends Thread{
        @Override
        public void run() {
            synchronized (u){
                System.out.println("in "+getName());
                Thread.currentThread().suspend();
            }
        }
    }
}
