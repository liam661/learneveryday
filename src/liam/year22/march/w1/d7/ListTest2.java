package liam.year22.march.w1.d7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/6 22:42
 **/
public class ListTest2 {
    public static void main(String[] args) {
        List<String> aList = new ArrayList();
        aList.add("a");
        aList.add("b");
        System.out.println("before: "+aList);
        for(int i = 0; i < aList.size();i++){
            if(aList.get(i).equals("b")){
                aList.remove(i);
            }
        }
        System.out.println("after: "+aList);
    }
}
