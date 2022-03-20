package liam.year22.march.w3.fri.reverse;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/18 9:30
 **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int y = s.reverse(2147483642);
        System.out.println(y);
        int x = s.reverse(987);
        System.out.println(x);
        long res = 1;
        for(int i = 0; i < 31;i++){
            res *= -2;
        }
        System.out.println(res);
    }
}
