package liam.year22.design.proxy.v9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/13 16:02
 **/
public class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("tank clacla...");
        try{
            Thread.sleep(new Random().nextInt(10000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String [] args){
        Tank tank = new Tank();
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
                new TankTimeProxy(tank));
        m.move();
    }
}

class TankTimeProxy implements InvocationHandler {

    Movable movable;

    public TankTimeProxy(Movable movable) {
        this.movable = movable;
    }

    public void before(){
        System.out.println("method start...");
    }

    public void after(){
        System.out.println("method end...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o =method.invoke(movable, args);
        after();
        return o;
    }
}

interface Movable{
    void move();
}
