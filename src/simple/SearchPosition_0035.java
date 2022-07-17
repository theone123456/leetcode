package simple;

/**
 * 给定一个排序数组和目标值，在数组中找出该目标值所有
 * 若目标值不存在与数组中，则返回它将插入的位置
 */

public class SearchPosition_0035 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5 ,6};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }
        return nums.length;
    }
}
