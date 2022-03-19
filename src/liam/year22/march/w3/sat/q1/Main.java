package liam.year22.march.w3.sat.q1;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/19 10:17
 **/
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = solution.myAtoi("-2147483648");
        System.out.println(a);
        System.out.println(solution.myAtoi(" 123"));
        System.out.println(solution.myAtoi(" -345 "));
        System.out.println(solution.myAtoi(" -+7890"));
        System.out.println(solution.myAtoi("11223344556677889900"));
        System.out.println(solution.myAtoi(" -112233.44.55aabb"));
    }
}
