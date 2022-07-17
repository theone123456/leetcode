package simple;

import java.util.Arrays;

/**
 * 给定一个整数数组nums和一个整数目标值target，请你在该数组中找出和为目标值target的那两个整数，并返回它们的数组下标
 *
 * 假设每种输入只对应一个答案，但是，数组中同一元素在答案里不能重复出现
 */
public class TwoSum_0001 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for (int i = 0;i < nums.length;i++){
            int a = nums[i];
            int b = target - a;
            for (int j = 0;j < nums.length;j++){
                if (j != i && b == nums[j]){
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return null;
    }
}
