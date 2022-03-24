package liam.year22.march.w4.thur.mergeTwoLists;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/24 11:16
 **/
public class Solution2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode parentNode = new ListNode(-1);
        ListNode prevNode = parentNode;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                prevNode.next = list1;
                list1 = list1.next;
            }else {
                prevNode.next = list2;
                list2 = list2.next;
            }
            prevNode = prevNode.next;
        }
        prevNode.next = list1 == null ? list2 : list1;
        return parentNode.next;
    }
}
