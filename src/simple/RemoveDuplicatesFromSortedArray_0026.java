package simple;

/**
 * 给定一个非降序排列数组，原地删除重复出现的元素，并返回新的数组长度
 *
 * 快慢指针
 *  快指针：遍历
 *  慢指针：指向新数组的最后一位
 */

public class RemoveDuplicatesFromSortedArray_0026 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int fast = 1;
        int slow = 0;
        while (fast < nums.length){
            if (nums[slow] >= nums[fast]){
                fast++;
            }else {
                int temp = nums[++slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
            }
        }
        return slow + 1;
    }
}
