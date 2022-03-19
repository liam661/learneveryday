package liam.year22.march.w3.sat.q1;

/**
 * @Description
 * atoi 将一个字符串转成一个数字
 * @Author liam661
 * @Date 2022/3/19 9:55
 **/
public class Solution {
    int MAX_INT_32_BIT = 214748364;
    public int myAtoi(String str){
        // 字符串判空
        if(str == null){
            return 0;
        }
        // 字符串判断长度
        int i = 0;
        int len = str.length();
        int res = 0;
        boolean isNegative = false;
        //1.开头判断是不是连续的空格
        while (str.charAt(i) == ' ' && i < len) {
            i++;
        }
        //2.如果全部都是空格直接返回
        if(i == len) {
            return 0;
        }
        //3.如果是负数
        if(str.charAt(i) == '-'){
            isNegative = true;
        }
        //4.开头的符号，需要往后移动一位
        if(str.charAt(i) == '+' || str.charAt(i) == '-') {
            i++;
        }
        while (i < len && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            int tmp = str.charAt(i) - 48;
            if(!isNegative && (res > MAX_INT_32_BIT || (res == MAX_INT_32_BIT && tmp > 7))){
                return MAX_INT_32_BIT * 10 + 7;
            }
            if(isNegative && (-res < -MAX_INT_32_BIT || (res == -MAX_INT_32_BIT && tmp > 8))){
                return MAX_INT_32_BIT * 10 - 8;
            }
            res = res * 10 + tmp;
            ++i;
        }
        // 如果有符号标记则返回负数
        if(isNegative) {
            return -res;
        }
        return res;
    }
}
