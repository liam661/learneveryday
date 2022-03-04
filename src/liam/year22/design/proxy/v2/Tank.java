package liam.year22.design.proxy.v2;
/**
 * @Description
 * @Author liam661
 * @Date 2022/2/13 9:59
 **/
public class Tank implements Movable {
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        try{
            Thread.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public static void main(String []args){
        new Tank().move();
    }
}
interface Movable{
    void move();
}
