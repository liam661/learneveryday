package liam.year22.march.w1.d7;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/6 22:42
 **/
public class ListTest3 {
    public static void main(String[] args) {
        List<String> aList = new ArrayList();
        aList.add("a");
        aList.add("b");
        System.out.println("before: "+aList);
        for(String s : aList){
            if("b".equals(s)){
                aList.remove(s);
            }
        }
        System.out.println("after: "+aList);
    }
}
