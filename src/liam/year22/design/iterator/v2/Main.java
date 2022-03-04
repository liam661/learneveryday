package liam.year22.design.iterator.v2;

/**
 * @Description
 * 用链表来实现一个容器
 * @Author liam661
 * @Date 2022/2/13 17:39
 **/
public class Main {
    public static void main(String [] args){
        LinkedList_ lk = new LinkedList_();
        for(int i = 0; i < 15;i++){
            lk.add(new String("s"+i));
        }
        System.out.println(lk.size());
    }
}
class LinkedList_{
    Node head = null;
    Node tail = null;
    private int size = 0;

    private class Node{
        Object o = new Object();
        Node next;
        public Node(Object o){
            this.o = o;
        }
    }

    public void add(Object o){
        Node n = new Node(o);
        n.next = null;
        if(head == null){
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
        size++;
    }
    public int size(){
        return size;
    }
}

