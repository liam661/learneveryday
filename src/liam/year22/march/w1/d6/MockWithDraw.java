package liam.year22.march.w1.d6;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description
 * 模拟转账程序
 * @Author liam661
 * @Date 2022/3/5 22:17
 **/
public class MockWithDraw {

    static int balance = 500;
    public static int withDraw(int amount) {
        synchronized (MockWithDraw.class){
            if(amount < balance){
                balance -= amount;
            }
            System.out.println(balance);
        }
        return balance;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        MockWithDraw mock = new MockWithDraw();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                withDraw(200);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                withDraw(200);
            }
        });
        t1.start();
        t2.start();
    }
}
