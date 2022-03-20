package liam.year22.march.w2.tues.addTwoNumbers;

/**
 * @Description
 * https://leetcode-cn.com/problems/add-two-numbers/
 * 遍历两个类考虑进位
 * @Author liam661
 * @Date 2022/3/9 20:25
 **/
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while (l1 != null || l2 != null){
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            if(head == null){
                tail = new ListNode((num1 + num2) % 10);
                head = tail;
            }else {
                tail.next = new ListNode((num1 + num2 + carry) % 10);
                tail = tail.next;
            }
            carry = (num1 + num2) / 10;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }
        if(carry > 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }
}
