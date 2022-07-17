package simple;

/**
 * 给定一个整数数组nums，找出一个具有最大和的连续子数组（最少包含一个元素），返回其最大和
 *
 * 定义两个变量，一个记录最大值，一个记录当前值
 */

public class MaximumSubarray_0053 {
    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int current = nums[0];

        for (int i = 1;i < nums.length;i++){
            if (current < 0){
                current = nums[i];
            }else {
                current += nums[i];
            }
            max = Math.max(max, current);
        }

        return max;
    }
}
