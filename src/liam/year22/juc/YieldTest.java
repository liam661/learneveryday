package liam.year22.juc;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/5 17:58
 **/
public class YieldTest {
    public static void main(String [] args) throws InterruptedException
    {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (true){
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("Interruted!");
                        break;
                    }
                    Thread.yield();
                }
            }
        };
        t1.start();
        Thread.sleep(2000);
        t1.interrupt();
    }
}
