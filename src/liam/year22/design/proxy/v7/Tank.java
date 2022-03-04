package liam.year22.design.proxy.v7;

import java.util.Random;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/13 11:21
 **/
public class Tank implements Movable{

    @Override
    public void move() {
        System.out.println("tank cla cla");
        try{
            Thread.sleep(new Random().nextInt(10000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        Tank tank = new Tank();
        TankTimeProxy ttp = new TankTimeProxy(tank);
        TankLogProxy tlp = new TankLogProxy(ttp);
        tlp.move();
    }
}

class TankTimeProxy implements Movable{
    Movable m;
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    public TankTimeProxy(Movable m) {
        this.m = m;
    }
}

class TankLogProxy implements Movable{
    Movable m;
    public TankLogProxy(Movable m) {
        this.m = m;
    }
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

interface Movable{
    void move();
}
