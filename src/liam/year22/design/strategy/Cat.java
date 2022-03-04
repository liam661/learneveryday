package liam.year22.design.strategy;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/9 20:41
 **/
public class Cat implements Comparable<Cat>{
    private int weight, height;

    Cat(int weight, int height){
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Cat c)
    {
        if(this.weight < c.weight)
            return -1;
        else if(this.weight > c.weight)
            return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
