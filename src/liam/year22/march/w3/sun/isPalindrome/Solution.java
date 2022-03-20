package liam.year22.march.w3.sun.isPalindrome;

/**
 * @Description
 * 判断一个数字是否是回文数
 * @Author liam661
 * @Date 2022/3/20 10:34
 **/
public class Solution {
    public boolean isPalindrome(int x){
        /**
         * 1.负数一定不是回文数：-1，-100
         * 2.以0结尾的数字不是回文数：10，20，100，0需要排除
         *
         */
        if(x < 0 || x % 10 == 0 && x != 0){
            return false;
        }
        /**
         * 下面这个while就是在求反转一半的数字
         * 1.循环整除10拿到最后一位数字 x%10 得到余数
         * 2.得到反转后的新数字reverted每一次整除得到的余数*10加上一次的余数就是反转后新数字
         * 3.在循环到一半的时候退出
         */
        int revertedNum = 0;
        while (x > revertedNum) {
            revertedNum = revertedNum * 10 + x % 10;
            x /= 10;
        }
        //前半部分条件：是偶数位情况，后半部分条件是：奇数位情况
        return x == revertedNum || revertedNum / 10 == x;
    }
}
