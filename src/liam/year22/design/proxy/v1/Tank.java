package liam.year22.design.proxy.v1;


/**
 * @Description
 * @Author liam661
 * -awwe222@Date 2022/2/13 9:48
 **/
interface Movable{
    void move();
}

public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("tank move clacclac...");
        try {
            Thread.sleep(1);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
