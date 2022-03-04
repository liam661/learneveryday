package liam.year22.jan.w4;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/24 17:26
 **/
public class ABC {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition c1 = lock.newCondition();
        Condition c2 = lock.newCondition();
        Condition c3 = lock.newCondition();
        CountDownLatch cdl2 = new CountDownLatch(1);
        CountDownLatch cdl3 = new CountDownLatch(1);

        Thread t1 = new Thread(() ->{
            lock.lock();
            try {
                for(int i = 0; i < 10; i++){
                    System.out.print("A");
                    c2.signal();
                    if(i == 0) cdl2.countDown();
                    c1.await();
                }
                c2.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });
        Thread t2 = new Thread(() ->{
            lock.lock();
            try {
                for(int i = 0;i < 10;i++){
                    System.out.print("B");
                    c3.signal();
                    if(i == 0) cdl3.countDown();
                    c2.await();
                }
                c3.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });
        Thread t3 = new Thread(() ->{
            lock.lock();
            try {
                for(int i = 0; i < 10; i++){
                    System.out.print("C");
                    c1.signal();
                    c3.await();
                }
                c1.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }
        });
        t1.start();
        t2.start();
        t3.start();
    }
}
