package liam.year22.jan.w4;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/23 20:56
 **/
public class ThreadPrintAB {
    public static void main(String[] args) {
        char [] aI = "12345678".toCharArray();
        char [] aC = "ABCDEFGH".toCharArray();
        Object o = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (o) {
                try {
                    for(int i = 0; i < aI.length; i++)
                    {
                        System.out.print(aI[i]);
                        o.notify();
                        o.wait();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                o.notify();
            }
        },"t1");

        Thread t2 = new Thread(() -> {
            synchronized (o){
                try {
                    for(int i = 0; i < aC.length; i++)
                    {
                        System.out.print(aC[i]);
                        o.notify();
                        o.wait();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                o.notify();
            }
        },"t2");
        t1.start();
        t2.start();
    }
}
