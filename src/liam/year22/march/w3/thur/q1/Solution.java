package liam.year22.march.w3.thur.q1;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/17 10:15
 **/
public class Solution {
    public String longestPalindrome(String s){
        int len = s.length();
        if(len < 2){
            return s;
        }
        int begin = 0;
        int maxLen = 1;
        boolean [][] dp = new boolean[len][len];
        for(int i = 0; i < len; i++){
            dp[i][i] = true;
        }
        char [] charArr = s.toCharArray();
        for(int L = 2; L <= len; L++) {
            for(int i = 0; i < len; i++) {
                int j = L + i - 1;
                if(j >= len) {
                    break;
                }
                if(charArr[i] != charArr[j]) {
                    dp[i][j] = false;
                }
                else {
                    if(j - i < 3) {
                        dp[i][j] = true;
                    }else {
                        dp[i][j] = dp[i+1][j-1];
                    }
                }
                if(dp[i][j] == true && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
