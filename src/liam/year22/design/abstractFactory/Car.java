package liam.year22.design.abstractFactory;

import liam.year22.design.simplefactory.Moveable;

/**
 * @Description
 * 汽车类
 * @Author liam661
 * @Date 2022/2/10 11:48
 **/
public class Car extends Vehicle {
    @Override
    public void go(){
        System.out.println("a car didi...");
    }
}
