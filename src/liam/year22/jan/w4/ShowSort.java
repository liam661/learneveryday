package liam.year22.jan.w4;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/27 17:22
 **/
public class ShowSort {
    static int a,b,x,y;
    public static void main(String[] args) throws InterruptedException{
        int i = 0;
        for(;;){
            long start = System.nanoTime();
            i++;
            x = 0;
            y = 0;
            a = 0;
            b = 0;
            Thread oneThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    a = 1;
                    x = b;
                }
            });
            Thread otherThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    b = 1;
                    y = a;
                }
            });
            oneThread.start();
            otherThread.start();
            oneThread.join();
            otherThread.join();
            if(x == 0 && y == 0){
                long end = System.nanoTime() - start;
                System.out.println("time： +" +end);
                break;
            }
        }
    }
}
