package liam.year22.jan.w4;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/23 22:22
 **/
public class ThreadPrintAB2 {

    public static void main(String[] args) {
            Lock lock = new ReentrantLock();
            char [] aI = "12345678".toCharArray();
            char [] aC = "ABCDEFGH".toCharArray();
            Condition condition1 = lock.newCondition();
            Condition condition2 = lock.newCondition();

            Thread t1 = new Thread(() -> {
                lock.lock();
                try{
                    for(int i = 0; i < aI.length; i++) {
                        System.out.print(aI[i]);
                        condition2.signal();
                        condition1.await();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            });

            Thread t2 = new Thread(() ->{
                lock.lock();
                try{
                    for (int i = 0;i < aC.length; i++){
                        System.out.print(aC[i]);
                        condition1.signal();
                        condition2.await();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            });
            t1.start();
            t2.start();
    }
}
