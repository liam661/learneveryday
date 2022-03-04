package liam.year22.jan.w1;

/**
 * @Description
 * @Author liam661
 * @Date 2022/1/2 16:58
 **/
public class DotNew {
    public class Inner{}
    public static void main(String [] args){
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
