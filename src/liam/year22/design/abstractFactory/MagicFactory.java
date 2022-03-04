package liam.year22.design.abstractFactory;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/10 16:20
 **/
public class MagicFactory extends AbstractFactory{

    @Override
    public Food createFood() {
        return new MushRoom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }
}
