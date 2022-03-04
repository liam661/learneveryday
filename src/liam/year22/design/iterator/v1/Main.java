package liam.year22.design.iterator.v1;

/**
 * @Description
 * 实现一个容器可以增加元素
 * @Author liam661
 * @Date 2022/2/13 17:24
 **/
public class Main {
    public static void main(String [] args){
        ArrayList_ arr = new ArrayList_();
        for(int i = 0; i < 15; i++){
            arr.add(new String("s" + i));
        }
        System.out.println(arr.size());
    }
}
class ArrayList_{
    Object [] objects = new Object[10];
    private int index = 0;
    public void add(Object o){
        if(index == objects.length){
            Object [] newObjects = new Object[objects.length * 2];
            System.arraycopy(objects, 0, newObjects, 0 ,objects.length);
            objects = newObjects;
        }
        objects[index] = o;
        index++;
    }

    public int size(){
        return index;
    }
}
