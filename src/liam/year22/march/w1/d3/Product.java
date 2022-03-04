package liam.year22.march.w1.d3;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/2 10:14
 **/
public class Product implements Runnable{
    private Storage storage;

    public Product(Storage storage) {
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
