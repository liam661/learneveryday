package liam.year22.design.strategy;

import java.util.Arrays;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/9 16:46
 **/
public class Main {
    public static void main(String [] args){
        //int arr [] = {30, 20, 10,40,50,70,90,45,78,12};
        //Sort.sort(arr);
        //BubbleSort.sort(arr);
        Cat a [] = {new Cat(3,3), new Cat(2,2),new Cat(1,1)};
        //Dog a [] = {new Dog(6), new Dog(5), new Dog(3)};
        //CatComparator cc = new Comparator();
        Sort <Cat>sort = new Sort();
        sort.sort(a, ((o1, o2) -> {
            if(o1.getHeight() < o2.getHeight()) return -1 ;
            else if (o1.getHeight() > o2.getHeight()) return 1;
            else return 0; }
            )
        );
        System.out.println(Arrays.toString(a));
    }
}
