package simple;

/**
 * 给定一个数组nums和一个值val，原地移除所有数值等于val的元素，并返回新数组的长度
 *
 * 双指针
 *  左：遍历，寻找等于val的元素
 *  右：控制边界，指向与左指针交换的元素，若指向元素等于val则左移
 */

public class RemoveElement_0027 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            if (nums[left] == val){
                if (nums[right] != val){
                    int temp = nums[right];
                    nums[right--] = nums[left];
                    nums[left] = temp;
                }else {
                    while (left <= right && nums[right] == val){
                        right--;
                    }
                    if (left < right){
                        int temp = nums[right];
                        nums[right--] = nums[left];
                        nums[left] = temp;
                    }else {
                        if (left != 0){
                            return left;
                        }else {
                            return 0;
                        }
                    }
                }
            }
            left++;
        }
        return left;
    }
}
