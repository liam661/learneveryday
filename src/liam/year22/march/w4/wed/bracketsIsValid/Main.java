package liam.year22.march.w4.wed.bracketsIsValid;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/23 14:53
 **/
public class Main {
    public static void main(String[] args) {
        String s = "()[{}]{}()";
        Solution solution = new Solution();
        System.out.println(solution.bracketsIsValid(s));
    }
}
