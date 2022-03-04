package liam.year22.design.singleton;

/**
 * @Description
 * 静态内部类
 * @Author liam661
 * @Date 2022/2/9 10:37
 **/
public class Mgr07 {
    private static class Mgr07Holder{
        private final static Mgr07 instance = new Mgr07();
    }

    public static Mgr07 getInstance(){
        return Mgr07Holder.instance;
    }

    public static void main(String [] args){
        for(int i = 0; i < 100; i++){
            new Thread(() -> {
                System.out.println(Mgr07.getInstance().hashCode());
            }).start();
        }
    }
}
