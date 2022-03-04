package liam.year22.jan.w4;


import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/24 17:55
 **/
public class TransferQueueTest {

    public static void main(String[] args) {
        char [] aI = "12345678".toCharArray();
        char [] aC = "ABCDEFGH".toCharArray();
        TransferQueue<Character> queue =
                new LinkedTransferQueue<Character>();
        new Thread(() -> {
            try {
                for(char c : aI){
                    queue.transfer(c);
                    System.out.print(queue.take());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"t1").start();

        new Thread(() ->{
            try {
                for(char c : aC) {
                    System.out.print(queue.take());
                    queue.transfer(c);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t2").start();
    }
}
