package simple;

import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数基础上+1，每个元素只存储单个数字
 *
 * 不能转为字符串再处理，会超过long的最大范围，除非使用BigDecimal
 */

public class PlusOne_0066 {
    public static void main(String[] args) {
        int[] digits = {9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        int index = 1;
        for (int i = digits.length - 1;i >= 0;i--){
            if (digits[i] + index == 10){
                digits[i] = 0;
                index = 1;
            }else {
                digits[i] += 1;
                return digits;
            }
        }
        int[] ret = new int[digits.length + 1];
        ret[0] = 1;
        for (int i = 0;i < digits.length;i++){
            ret[i + 1] = digits[i];
        }
        return ret;
    }
}
