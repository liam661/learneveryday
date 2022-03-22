package liam.year22.march.w4.mon.longCommonPrefix;

/**
 * @Description
 * 横向比较法
 * @Author liam661
 * @Date 2022/3/21 10:47
 **/
public class Solution {
    public String longCommonPrefix(String [] strs){
        String prefix = strs[0];
        int len = strs.length;
        // 从第一个开始横向比较，拿公共开头的字符串和后面的继续比较
        for(int i = 1; i < len; i++){
            prefix = longCommonPrefix(prefix, strs[i]);
            if(prefix.length() == 0){
                break;
            }
        }
        return prefix;
    }

    /**
     * 比较两个字符串，获取开头的公共字符串
     * @param str1
     * @param str2
     * @return 开头的公共字符串
     */
    public String longCommonPrefix(String str1, String str2){
        // 只需要比较到公共长度即可，需要找到两个字符串的最短长度
        int len = Math.min(str1.length(), str2.length());
        int index = 0;
        while (index < len && str1.charAt(index) == str2.charAt(index)){
            index++;
        }
        return str1.substring(0, index);
    }
}
