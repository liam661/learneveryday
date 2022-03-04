package liam.year22.design.abstractFactory;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/10 16:04
 **/
public abstract class AbstractFactory {
    public abstract Food createFood();

    public abstract Vehicle createVehicle();

    public abstract Weapon createWeapon();
}
