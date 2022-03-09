package liam.year22.march.w2.tues;

import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/9 20:29
 **/
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
