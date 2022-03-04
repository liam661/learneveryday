package liam.year22.design.strategy;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/9 21:18
 **/
public class Dog implements Comparable<Dog>{
    private int food;
    Dog(int food){
        this.food = food;
    }

    @Override
    public int compareTo(Dog d) {
        if(this.food < d.food) return -1;
        else if(this.food > d.food) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
