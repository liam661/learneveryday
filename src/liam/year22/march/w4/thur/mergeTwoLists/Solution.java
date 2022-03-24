package liam.year22.march.w4.thur.mergeTwoLists;

/**
 * @Description
 * 合并两个升序的链表，使他变成一个升序的链表
 * @Author liam661
 * @Date 2022/3/24 10:05
 **/
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
