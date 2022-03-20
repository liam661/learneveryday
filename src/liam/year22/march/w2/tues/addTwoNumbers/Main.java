package liam.year22.march.w2.tues.addTwoNumbers;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/9 21:03
 **/
public class Main {
    public static void main(String[] args) {
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(4,a);
        ListNode c = new ListNode(2,b);

        ListNode x = new ListNode(4);
        ListNode y = new ListNode(6,x);
        ListNode z = new ListNode(5,y);

        Solution s = new Solution();
        ListNode l3 = s.addTwoNumbers(c,z);
        System.out.println(l3);
        Solution2 s2 = new Solution2();
        ListNode l4 = s2.addTwoNumbers(c,z);
        System.out.println(l4);
    }
}
