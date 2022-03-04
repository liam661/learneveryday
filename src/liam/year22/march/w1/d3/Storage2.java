package liam.year22.march.w1.d3;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Description
 * 仓库类
 * @Author liam661
 * @Date 2022/3/2 10:03
 **/
public class Storage2 {
    private final int MAX_SIZE = 10;
    private LinkedList<Object> list = new LinkedList<>();
    private final Lock lock = new ReentrantLock();
    private final Condition full = lock.newCondition();
    private final Condition empty = lock.newCondition();

    public void product() {
        lock.lock();
        while (list.size() > MAX_SIZE - 1) {
            System.out.println("仓库已满 "+Thread.currentThread().getName());
            try {
                full.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.add(new Object());
        System.out.println(
                "生产者 "+Thread.currentThread().getName()+"生产一个产品"+"库存数量："+list.size());
        empty.signalAll();
        lock.unlock();
    }

    public void customer() {
        lock.lock();
        while (list.size() == 0){
            System.out.println("仓库数量为0");
            try {
                empty.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        list.remove();
        System.out.println("消费者"+Thread.currentThread().getName()+"消费了一个"
                +"库存数量："+list.size());
        full.signalAll();
        lock.unlock();
    }
}
