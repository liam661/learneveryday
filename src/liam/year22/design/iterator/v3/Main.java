package liam.year22.design.iterator.v3;

/**
 * @Description
 * @Author liam661
 * @Date 2022/2/13 17:50
 **/
public class Main {
    public static void main(String [] args){
        //Collection_ c = new ArrayList_();
        Collection_ c = new LinkedList_();
        for(int i = 0; i < 12; i++){
            c.add(new String("s"+ i));
        }
        System.out.println(c.size());
    }
}

