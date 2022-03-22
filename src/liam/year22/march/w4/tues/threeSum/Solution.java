package liam.year22.march.w4.tues.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/22 11:02
 **/
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        int len = nums.length;
        // 需要对数字做个排序
        Arrays.sort(nums);
        ArrayList<List<Integer>> ans = new ArrayList<>(); // 存储三个数字结果的list
        int third = len - 1;
        for(int first = 0; first < len; first++){
            // 需要判断第二个数字是不是重复,重复跳出当前循环
            if(first > 0 && nums[first] == nums[first-1]){
                continue;
            }
            int target = -nums[first]; // 求和目标值，已经知道一个值，另一个值就是这个数字的相反数
            for(int second = first + 1; second < len; second++){
                // 后面的数字相同了继续向后遍历
                if(second > first+1 && nums[second] == nums[second - 1]){
                    continue;
                }
                //
                while (second < third && nums[second] + nums[third] > target){
                    third--;
                }
                // 如果指针重合，随着后续b增加
                // 就不会有a+b+c=0 并且b<c的c了，可以退出循环
                if(second == third){
                    break;
                }
                if(nums[second] + nums[third] == target){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
}
