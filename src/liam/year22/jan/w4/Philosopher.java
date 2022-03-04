package liam.year22.jan.w4;

/**
 * @Description
 * 哲学家问题
 * @Author liam661
 * @Date 2022/2/24 16:41
 **/
public class Philosopher extends Thread{
    private ChopStick left, right;
    private int index;
    public Philosopher(String name, int index,ChopStick left,ChopStick right){
        this.setName(name);
        this.index = index;
        this.left = left;
        this.right = right;
    }

    @Override
    public void run() {
        if(index / 2 == 0){
            try {
                synchronized (right){
                    Thread.sleep(1);
                    synchronized (left) {
                        Thread.sleep(1);
                        System.out.println(index+"哲学家吃完晚饭了");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            try {
                synchronized (left){
                    Thread.sleep(1);
                    synchronized (right) {
                        Thread.sleep(1);
                        System.out.println(index+"哲学家吃完晚饭了");
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ChopStick c0 = new ChopStick();
        ChopStick c1 = new ChopStick();
        ChopStick c2 = new ChopStick();
        ChopStick c3 = new ChopStick();
        ChopStick c4 = new ChopStick();
        Philosopher p0 = new Philosopher("p0",0, c0,c1);
        Philosopher p1 = new Philosopher("p1",1, c1,c2);
        Philosopher p2 = new Philosopher("p2",2, c2,c3);
        Philosopher p3 = new Philosopher("p3",3, c3,c4);
        Philosopher p4 = new Philosopher("p4",4, c4,c0);
        p0.start();
        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
