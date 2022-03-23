package liam.year22.march.w4.wed.threeSumCloset;

import java.util.Arrays;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/23 9:18
 **/
public class Solution {
    public int threeSumCloset(int [] nums, int target){
        int len = nums.length;
        Arrays.sort(nums);
        int best = 100000;
        for(int i = 0; i < len; i++){
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }
            int j = i + 1;
            int k = len - 1;
            while (j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target){
                    return target;
                }
                if(Math.abs(sum-target) < Math.abs(best-target)){
                    best = sum;
                }
                // 如果和大于target，应该移动c对应的指针
                if(sum > target){
                    int k0 = k - 1;
                    // j 就是往左移动的边界，如果是重复的数字继续往左移动
                    // 移动到下一个不相等的元素
                    while (k0 > j && nums[k] == nums[k0]){
                        k0--;
                    }
                    k = k0;
                }else {
                    //如果和小于target，移动b对应的指针
                    int j0 = j + 1;
                    // 移动到下一个不相等的元素
                    while (j0 < k && nums[j] == nums[j0]){
                        j0++;
                    }
                    j = j0;
                }
            }
        }
        return best;
    }
}
