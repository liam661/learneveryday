package liam.year22.design.simplefactory;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/10 11:49
 **/
public class Main {
    public static void main(String [] args){
        /*Car car = new Car();
        Bread bread = new Bread();
        Ak47 ak47 = new Ak47();
        car.go();
        bread.printName();
        ak47.shoot();*/
       Moveable m = new CarFactory().create();
       m.go();
       Moveable n = new PlaneFactory().create();
       n.go();
    }
}
