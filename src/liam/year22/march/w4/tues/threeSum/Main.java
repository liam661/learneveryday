package liam.year22.march.w4.tues.threeSum;

import java.util.Arrays;
import java.util.List;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/22 11:04
 **/
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {1,-1,0,2,-1,-1};
        List<List<Integer>> lists = s.threeSum(nums);
        System.out.println(lists);
    }
}
