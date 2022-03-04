package liam.year22.design.singleton;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/9 8:26
 **/
public class Mgr01 {
    private static final Mgr01 instance = new Mgr01();

    public static Mgr01 getInstance(){
        return instance;
    }

    public static void main(String [] args){
        Mgr01 m1 = getInstance();
        Mgr01 m2 = getInstance();
        System.out.println(m1 == m2);
    }
}
