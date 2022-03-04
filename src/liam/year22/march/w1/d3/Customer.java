package liam.year22.march.w1.d3;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/2 10:12
 **/
public class Customer implements Runnable{
    private Storage storage;

    public Customer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            storage.customer();
        }
    }
}
