package liam.year22.march.w3.fri.q1;

/**
 * @Description
 * 将一个数字反转,数字的范围在[-2^31 2^31 -1]
 * @Author liam661
 * @Date 2022/3/18 8:52
 **/
public class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int tmp = x % 10;
            if(res > 214748364 || (res > 214748364 && tmp > 7)){
                return 0;
            }
            if(res < -214748364 || (res < -214748364) && tmp < -8){
                return 0;
            }
            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }
}
