package liam.year22.design.singleton;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/9 10:18
 **/
public class Mgr05 {
    private static Mgr05 instance;
    public static Mgr05 getInstance(){
        if(instance == null)
        {
            try{
                Thread.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            instance = new Mgr05();
        }
        return instance;
    }

    public static void main(String [] args){
        for(int i = 0; i < 100; i++)
        {
            new Thread(()->{
                System.out.println(Mgr05.getInstance().hashCode());
            }).start();
        }
    }
}
