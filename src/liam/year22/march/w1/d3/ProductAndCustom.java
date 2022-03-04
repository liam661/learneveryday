package liam.year22.march.w1.d3;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/2 8:11
 **/
public class ProductAndCustom {
    public static List<Character> productArray = new ArrayList();

    public static void main(String[] args) {
        char [] abcStrArr = "abcdef".toCharArray();
        Object o = new Object();
        Thread productThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    try {
                        if(productArray.size() == 0){
                            System.out.println("product...");
                            for(char c : abcStrArr) {
                                productArray.add(c);
                            }
                        }
                        o.notify();
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    o.notify();
                }
            }
        });

        Thread customerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (o){
                    try {
                        if(productArray.size() >0){
                            System.out.println("customer ...");
                            for(int i = 0; i < productArray.size(); i++){
                                System.out.println(productArray.get(i));
                            }
                        }else {
                            o.notify();
                            o.wait();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    o.notify();
                }
            }
        });
        productThread.start();
        customerThread.start();
    }
}
