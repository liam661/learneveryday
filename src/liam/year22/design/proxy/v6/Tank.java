package liam.year22.design.proxy.v6;

import java.util.Random;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/13 10:58
 **/
public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("tank cla cla ...");
        try{
            Thread.sleep(new Random().nextInt(10000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        new TankTimeProxy(new Tank()).move();
        new TankLogProxy(new Tank()).move();
    }
}

class TankTimeProxy implements Movable{
    Tank tank;
    public TankTimeProxy(Tank tank){
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

class TankLogProxy implements Movable{
    Tank tank;

    public TankLogProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("start moving");
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
interface Movable{
    void move();
}
