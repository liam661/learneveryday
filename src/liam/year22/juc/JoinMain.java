package liam.year22.juc;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/5 18:42
 **/
public class JoinMain {
    public volatile static int i = 0;
    public static class AddThread extends Thread{
        @Override
        public void run() {
            for(int i = 0; i < 1000000; i++){
            }
        }
    }

    public static void main(String [] args) throws InterruptedException{
        AddThread at = new AddThread();
        at.start();
        at.join();
        System.out.println(i);
    }
}
