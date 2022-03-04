package liam.year22.march.w1.d3;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/2 10:12
 **/
public class Customer2 implements Runnable{
    private Storage2 storage2;

    public Customer2(Storage2 storage2) {
        this.storage2 = storage2;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            storage2.customer();
        }
    }
}
