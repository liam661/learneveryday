package liam.year22.design.abstractFactory;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/10 16:12
 **/
public class ModernFactory extends AbstractFactory{

    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new Ak47();
    }
}
