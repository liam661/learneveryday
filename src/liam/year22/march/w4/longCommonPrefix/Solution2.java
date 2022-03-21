package liam.year22.march.w4.longCommonPrefix;

/**
 * @Description
 * 寻找公共开头字符串纵向比较法
 * @Author liam661
 * @Date 2022/3/21 12:13
 **/
public class Solution2 {
    public String longCommonPrefix(String [] strArr){
        if(strArr == null || strArr.length == 0){
            return null;
        }
        int len = strArr[0].length(); // 外循环：遍历的次数,以数组中第一个字符串的长度为条件
        int strLen = strArr.length; // 内循环：数组中字符串的个数，
        for(int i = 0; i < len; i++) {
            char c = strArr[0].charAt(i);
            // 遍历字符数组中的每一字符串
            for(int j = 1; j< strLen; j++) {
                // 1.数组中只要有一个长度等于了i，就不用比较了，说明该字符串长度比较短
                // 2.每一个字符串相同位置的字符都需要比较
                while (i == strArr[j].length() || strArr[j].charAt(i) != c){
                    return strArr[0].substring(0,i);
                }
            }
        }
        return strArr[0];
    }
}
