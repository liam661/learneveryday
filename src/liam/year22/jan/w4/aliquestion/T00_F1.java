package liam.year22.jan.w4.aliquestion;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/25 10:27
 **/
public class T00_F1 {
    private static class Mytask extends Thread{
        private String name;
        private int timeInSeconds;
        private boolean success;

        public Mytask(String name,int timeInSeconds, boolean success) {
            this.name = name;
            this.timeInSeconds = timeInSeconds;
            this.success = success;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(timeInSeconds);
                System.out.println(name+" 任务结束!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Thread t1 = new Mytask("t1",3,true);
        Thread t2 = new Mytask("t2",4,true);
        Thread t3 = new Mytask("t3",1,false);

        t1.start();
        t2.start();
        t3.start();
        System.in.read();
    }
}
