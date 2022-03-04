package liam.year22.design.simplefactory;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/10 14:18
 **/
public class PlaneFactory {
    public Moveable create() {
        System.out.println("a plane created");
        return new Plane();
    }

    public int add(int a, int b){
        return a + b;
    }
}
