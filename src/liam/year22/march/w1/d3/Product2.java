package liam.year22.march.w1.d3;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/2 10:14
 **/
public class Product2 implements Runnable{
    private Storage2 storage;

    public Product2(Storage2 storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            storage.product();
        }
    }
}
