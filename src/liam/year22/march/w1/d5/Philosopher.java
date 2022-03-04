package liam.year22.march.w1.d5;

import liam.year22.jan.w4.ChopStick;

/**
 * @Description
 * 哲学家问题，五个哲学家围在一张圆桌上一起吃饭，他们中间各有一只筷子，每个哲学家都需要先拿起左边的筷子，再拿右边的筷子，才能完成进餐
 * @Author liam661
 * @Date 2022/3/4 17:13
 **/
public class Philosopher implements Runnable{
    private ChopStick left;
    private ChopStick right;
    private int index;
    public Philosopher(int index, ChopStick left, ChopStick right) {
        this.index = index;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        if(index / 2 == 0){
            synchronized (left) {
                System.out.println(Thread.currentThread().getName()+"拿起了左边的筷子");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (right) {
                    System.out.println(Thread.currentThread().getName()+"拿起来右边的筷子"+"...完成进餐");
                }
            }
        }else {
            synchronized (right) {
                System.out.println(Thread.currentThread().getName()+"拿起了右边的筷子");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (left) {
                    System.out.println(Thread.currentThread().getName()+"拿起来左边的筷子"+"...完成进餐");
                }
            }
        }
    }

    public static void main(String [] args){
        ChopStick c1 = new ChopStick();
        ChopStick c2 = new ChopStick();
        ChopStick c3 = new ChopStick();
        ChopStick c4 = new ChopStick();
        ChopStick c5 = new ChopStick();
        Thread t1 = new Thread(new Philosopher(1,c1,c2),"p1");
        Thread t2 = new Thread(new Philosopher(2,c2,c3),"p2");
        Thread t3 = new Thread(new Philosopher(3,c3,c4),"p3");
        Thread t4 = new Thread(new Philosopher(4,c4,c5),"p4");
        Thread t5 = new Thread(new Philosopher(5,c5,c1),"p5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
