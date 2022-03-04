package liam.year22.design.singleton;

/**
 * 枚举单例
 */
public enum Mgr08 {
    instance;
    public static void main(String [] args){
        for(int i = 0; i < 100; i++){
            System.out.println(Mgr08.instance.hashCode());
            System.out.println();
        }
    }
}
