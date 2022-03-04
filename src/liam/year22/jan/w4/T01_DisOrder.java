package liam.year22.jan.w4;

import java.util.concurrent.CountDownLatch;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/24 19:27
 **/
public class T01_DisOrder {
    private static int a = 0,b = 0;
    private static int x = 0, y = 0;

    public static void main(String[] args) throws Exception{
        for(int i = 0; i < Long.MAX_VALUE; i++){
            a = 0;
            b = 0;
            x = 0;
            y = 0;
            CountDownLatch latch = new CountDownLatch(2);
            Thread one = new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    x = b;
                    latch.countDown();
                }
            });
            Thread other = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    y = a;
                    latch.countDown();
                }
            });
            one.start();
            other.start();
            latch.await();
            String result = "第" + i+"次"+"("+x+","+y+")";
            if(x == 0 && y == 0){
                System.out.println(result);
                break;
            }
        }

    }
}
