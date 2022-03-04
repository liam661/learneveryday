package liam.year22.design.abstractFactory;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/10 16:11
 **/
public class Main {
    public static void main(String [] args){
        AbstractFactory factory = new ModernFactory();
        Food f = factory.createFood();
        f.printName();
        Vehicle v = factory.createVehicle();
        v.go();
        Weapon w = factory.createWeapon();
        w.shoot();
        AbstractFactory magicFactory = new MagicFactory();
        Food f2 = magicFactory.createFood();
        f2.printName();
        Weapon w2 = magicFactory.createWeapon();
        w2.shoot();
        Vehicle v2 = magicFactory.createVehicle();
        v2.go();
    }
}
