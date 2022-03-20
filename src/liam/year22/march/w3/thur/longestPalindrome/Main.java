package liam.year22.march.w3.thur.longestPalindrome;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/17 10:19
 **/
public class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        String longs = s1.longestPalindrome("babad");
        //String longs = s1.longestPalindrome("edcabacde");
        System.out.println(longs);
        //System.out.println(5 / 2);
        Solution2 s2 = new Solution2();
        String ls = s2.longestPalindrome("fdcaacdhk");
        System.out.println(ls);
        String ls2 = "fdcaacdhk".substring(1,7);
        System.out.println(ls);
    }
}
