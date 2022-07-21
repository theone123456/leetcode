package simple;

/**
 * 跟定一个非空数组，一个元素只出现一次，其余元素都出现两次
 *
 * 异或，相同为0，不同为1
 */

public class SingleNumber_0136 {
    public static void main(String[] args) {

    }

    public static int singleNumber(int[] nums) {
        int ret = nums[0];
        for (int i = 1;i < nums.length;i++){
            ret ^= nums[i];
        }
        return ret;
    }
}
