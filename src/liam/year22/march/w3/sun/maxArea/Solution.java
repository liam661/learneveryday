package liam.year22.march.w3.sun.maxArea;

/**
 * @Description
 * 求容器的最大面积
 * 通过左右指针的方式解决
 * @Author liam661
 * @Date 2022/3/20 14:39
 **/
public class Solution {
    public int maxArea(int [] height){
        /**
         * 采用左右指针标记，难点在于证明移动之后的面积小于之前的面积
         * 1. left指向数组最左边，right指向数组最右边
         * 2. 求一个面积：取左边高度和右边高度中高度低的值 * 间距
         * 3. 如果左边高度小于等于右边则移动左边
         * 4. 如果右边高度小于左边则移动右边，
         * 5. 当数组遍历完退出遍历
         */
        int left = 0;
        int right = height.length - 1;
        int ans = 0;
        while (left < right){
            int area = Math.min(height[left], height[right]) * (right - left - 1);
            ans = Math.max(ans, area);
            if(height[left] <= height[right]){
                left++;
            }else {
                right--;
            }
        }
        return ans;
    }
}
