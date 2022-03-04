package liam.year22.design.strategy;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/9 21:46
 **/
public class CatComparator implements Comparator<Cat>{

    @Override
    public int compareTo(Cat o1, Cat o2) {
        if(o1.getHeight() < o2.getHeight()) return -1;
        else if(o1.getHeight() > o2.getHeight()) return 1;
        else return 0;
    }
}
