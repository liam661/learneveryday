package liam.year22.jan.w1;

/**
 * @Description 在1970-2100年之间给定一个日期年月日查看是星期几
 * @Author liam661
 * @Date 2022/1/3 16:37
 **/
public class Solution1 {
    //
    static int [] nums = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
    static String [] ss = new String [] {"Sunday", "Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday"};
    public static String dayOfTheWeek2(int day, int month, int year) {
        int ans = 4;
        for(int i = 1971; i < year; i++){
            boolean isLeap = (i % 100 != 0 && i % 4 == 0) || i % 400 == 0;
            ans += isLeap ? 366 : 365;
        }
        for(int j = 1; j < month; j++){
            ans += nums[j-1];
            if(j == 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)){
                ans++;
            }
        }
        ans += day;
        return ss[ans % 7];
    }

    public static String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        /* 输入年份之前的年份的天数贡献 */
        int days = 365 * (year - 1971) + (year - 1969) / 4;
        /* 输入年份中，输入月份之前的月份的天数贡献 */
        for (int i = 0; i < month - 1; ++i) {
            days += monthDays[i];
        }
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days += 1;
        }
        /* 输入月份中的天数贡献 */
        days += day;
        return week[(days + 3) % 7];
    }

    public static void main(String [] args){
        System.out.println(dayOfTheWeek(3,1,2022));
    }
}
