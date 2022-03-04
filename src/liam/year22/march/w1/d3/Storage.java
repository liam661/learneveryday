package liam.year22.march.w1.d3;

import java.util.LinkedList;

/**
 * @Description
 * 仓库类
 * @Author liam661
 * @Date 2022/3/2 10:03
 **/
public class Storage {
    private final int MAX_SIZE = 10;
    private LinkedList<Object> list = new LinkedList<>();

    public void product(){
        synchronized (list){
            while (list.size() > MAX_SIZE - 1){
                System.out.println("仓库已满 "+Thread.currentThread().getName());
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.add(new Object());
            System.out.println(
                    "生产者 "+Thread.currentThread().getName()+"生产一个产品"+"库存数量："+list.size());
            list.notifyAll();
        }
    }

    public void customer(){
        synchronized (list){
            while (list.size() == 0){
                System.out.println("仓库数量为0");
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            list.remove();
            System.out.println("消费者"+Thread.currentThread().getName()+"消费了一个"
                    +"库存数量："+list.size());
            list.notifyAll();
        }
    }
}
