package liam.year22.design.iterator.v3;

/**
 * @Description
 * 实现一个共同接口
 * @Author liam661
 * @Date 2022/2/13 17:53
 **/
public class LinkedList_ implements Collection_{
    
    LinkedList_.Node head = null;
    LinkedList_.Node tail = null;
    private int size = 0;

    private class Node{
        Object o = new Object();
        LinkedList_.Node next;
        public Node(Object o){
            this.o = o;
        }
    }

    @Override
    public void add(Object o){
        LinkedList_.Node n = new LinkedList_.Node(o);
        n.next = null;
        if(head == null){
            head = n;
            tail = n;
        }
        tail.next = n;
        tail = n;
        size++;
    }

    @Override
    public int size(){
        return size;
    }
}
