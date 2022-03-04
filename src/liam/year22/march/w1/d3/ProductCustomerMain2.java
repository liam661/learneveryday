package liam.year22.march.w1.d3;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/2 10:17
 **/
public class ProductCustomerMain2 {
    public static void main(String[] args) {
        Storage2 storage = new Storage2();
        Thread p1 = new Thread(new Product2(storage));
        Thread p2 = new Thread(new Product2(storage));
        Thread p3 = new Thread(new Product2(storage));
        Thread c1 = new Thread(new Customer2(storage));
        Thread c2 = new Thread(new Customer2(storage));
        Thread c3 = new Thread(new Customer2(storage));
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();
    }
}
