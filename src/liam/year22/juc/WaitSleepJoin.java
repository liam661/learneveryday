package liam.year22.juc;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/4 18:10
 **/
public class WaitSleepJoin {

    static void testSleep(){
        new Thread(() ->{
            for(int i = 0; i < 10; i++){
                System.out.println("A: "+ i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException exception){
                    exception.printStackTrace();
                }
            }
        }).start();
    }

    static void testYield(){
        new Thread(() ->{
            for(int i = 0; i <= 100; i++){
                System.out.println("A---" + i);
                if(i % 10 == 0){
                    Thread.yield();
                }
            }
        }).start();

        new Thread(() -> {
            for(int i = 0; i <= 100;i++){
                System.out.println("B---"+ i);
                if(i % 10 == 0){
                    Thread.yield();
                }
            }
        }).start();
    }

    static void testJoin(){
        Thread t1 = new Thread(
                () ->{
                    for(int i = 0; i < 100; i++){
                        System.out.println("A" + i);
                        try{
                            Thread.sleep(500);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                });

        Thread t2 = new Thread(()->{
            try{
                t1.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            for(int i = 0; i < 100; i++){
                System.out.println("B" +
                        ""+ i);
                try{
                    Thread.sleep(500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();
    }

    public static void main(String [] args){
        //testSleep();
        //testYield();
        testJoin();
    }
}
