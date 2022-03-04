package liam.year22.design.singleton;

/**
 * @Description 懒汉方式
 * 线程不安全
 * @Author liam661
 * @Date 2022/2/9 8:53
 **/
public class Mgr03 {
    private static Mgr03 instance;

    public static Mgr03 getInstance(){
        if(instance == null){
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            instance = new Mgr03();
        }
        return instance;
    }

    public static void main(String [] args){
        for(int i = 0; i < 100;i++){
            new Thread(() -> {
                System.out.println(Mgr03.getInstance().hashCode());
            }).start();
        }
    }
}
