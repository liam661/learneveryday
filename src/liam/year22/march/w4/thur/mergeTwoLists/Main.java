package liam.year22.march.w4.thur.mergeTwoLists;

import java.util.Arrays;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/24 10:19
 **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode l1 = new ListNode(1);
        ListNode b = new ListNode(3);
        ListNode c = new ListNode(5);
        l1.next = b;
        b.next = c;
        ListNode l2 = new ListNode(1);
        ListNode f = new ListNode(2);
        ListNode g = new ListNode(4);
        l2.next = f;
        f.next = g;
        ListNode merge = s.mergeTwoLists(l1, l2);
        System.out.println(merge);

        ListNode l3 = new ListNode(1);
        ListNode h = new ListNode(4);
        ListNode i = new ListNode(5);
        l3.next = h;
        h.next = i;
        ListNode l4 = new ListNode(1);
        ListNode j = new ListNode(2);
        ListNode k = new ListNode(3);
        ListNode l = new ListNode(6);
        l4.next = j;
        j.next = k;
        k.next = l;
        Solution2 s2 = new Solution2();
        ListNode mergeTwoLists = s2.mergeTwoLists(l3, l4);
        System.out.println(mergeTwoLists);
    }
}
