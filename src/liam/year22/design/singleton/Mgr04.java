package liam.year22.design.singleton;

/**
 * @Description
 * 锁加在整个方法上,效率太低
 * @Author liam661
 * @Date 2022/2/9 9:29
 **/
public class Mgr04 {
    private static Mgr04 instance;
    public static synchronized Mgr04 getInstance(){
        if(instance == null){
            instance = new Mgr04();
        }
        return instance;
    }

    public static void main(String [] args){
        for(int i = 0; i < 100; i++){
            new Thread(() ->{
                System.out.println(Mgr04.getInstance().hashCode());
            }).start();
        }
    }
}
