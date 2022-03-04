package liam.year22.march.w1.d3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * 使用lock unlock 解决生产者消费者问题
 * @Author liam661
 * @Date 2022/3/2 8:50
 **/
public class ProductAndCustom2 {
    public static List<Character> productArr = new ArrayList<Character>();
    public static char charsArr [] = "abcde".toCharArray();

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Condition productCdt = lock.newCondition();
        Condition customCdt = lock.newCondition();
        Thread productThead = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    if(productArr.size() == 0){
                        for(int i = 0; i < charsArr.length; i++){
                            productArr.add(charsArr[i]);
                        }
                        customCdt.signal();
                        productCdt.await();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });
        Thread customerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try {
                    if(productArr.size() > 0){
                        for(Character c : productArr){
                            System.out.print(c);
                        }
                        productCdt.signal();
                        customCdt.await();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        });
        productThead.start();
        customerThread.start();
    }
}
