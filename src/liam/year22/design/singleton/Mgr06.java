package liam.year22.design.singleton;

/**
 * @Description
 * 双重加锁单例模式
 * @Author liam661
 * @Date 2022/2/9 10:29
 **/
public class Mgr06 {
    private static Mgr06 instance;

    public static Mgr06 getInstance(){
        if(instance == null)
        {
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            synchronized (Mgr06.class){
                if(instance == null){
                    instance = new Mgr06();
                }
            }
        }
        return instance;
    }

    public static void main(String [] args){
        for(int i = 0; i < 1000; i++){
            new Thread(() ->{
                System.out.println(Mgr06.getInstance().hashCode()); }
            ).start();
        }
    }
}
