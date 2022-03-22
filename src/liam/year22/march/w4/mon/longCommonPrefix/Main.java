package liam.year22.march.w4.mon.longCommonPrefix;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/21 11:13
 **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        String [] strArr = {"abwecde", "abcert", "abcuiop"};
        System.out.println(s.longCommonPrefix(strArr));
        String [] leets = {"leets", "leetcode", "leet", "leetss", "leetasd"};
        Solution2 s2 = new Solution2();
        System.out.println(s2.longCommonPrefix(leets));
        System.out.println(s2.longCommonPrefix(strArr));
    }
}
