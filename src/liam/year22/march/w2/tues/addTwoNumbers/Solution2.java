package liam.year22.march.w2.tues.addTwoNumbers;

/**
 * @Description
 * 递归实现
 * @Author liam661
 * @Date 2022/3/9 21:52
 **/
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        return add(l1, l2, 0);
    }
    public ListNode add(ListNode l1, ListNode l2, int bit){
        if(l1 == null && l2 == null && bit == 0){
            return null;
        }
        int val = bit;
        if(l1 != null){
            val += l1.val;
            l1 = l1.next;
        }
        if(l2 != null){
            val += l2.val;
            l2 = l2.next;
        }
        ListNode node = new ListNode(val % 10);
        node.next = add(l1, l2, val / 10);
        return node;
    }
}
