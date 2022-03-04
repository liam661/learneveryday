package liam.year22.design.simplefactory;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/10 14:18
 **/
public class CarFactory{
    public Moveable create() {
        System.out.println("a car created");
        return new Car();
    }
}
