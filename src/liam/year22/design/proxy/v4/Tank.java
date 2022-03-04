package liam.year22.design.proxy.v4;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/13 10:09
 **/
public class Tank implements Movable{
    @Override
    public void move() {
        System.out.println("Tank moving claclacla");
        long start = System.currentTimeMillis();
        try{
            Thread.sleep(new Random().nextInt(10000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void main(String [] args){
        new Tank2().move();
    }
}

class Tank2 extends Tank{
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

interface Movable{
    void move();
}
