package simple;

import java.util.Arrays;

/**
 * 给定两个二进制字符串，返回它们的二进制和
 */

public class AddBinary_0067 {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        char[] a_c = a.toCharArray();
        char[] b_c = b.toCharArray();
        char[] sum = new char[Math.max(a.length(), b.length()) + 1];
        char index = '0';

        int a_point = a_c.length - 1;
        int b_point = b_c.length - 1;
        int sum_point = sum.length - 1;

        while (a_point >= 0 && b_point >= 0){
            if (index == '0'){
                if (a_c[a_point] == '0' && b_c[b_point] == '0'){
                    sum[sum_point--] = '0';
                }else if (a_c[a_point] == '0' || b_c[b_point] == '0'){
                    sum[sum_point--] = '1';
                }else {
                    sum[sum_point--] = '0';
                    index = '1';
                }
            }else {
                if (a_c[a_point] == '0' && b_c[b_point] == '0'){
                    sum[sum_point--] = '1';
                    index = '0';
                }else if (a_c[a_point] == '0' || b_c[b_point] == '0'){
                    sum[sum_point--] = '0';
                }else {
                    sum[sum_point--] = '1';
                }
            }
            a_point--;
            b_point--;
        }
        
        while (a_point >= 0){
            if (index == '0'){
                sum[sum_point--] = a_c[a_point];
            }else {
                if (a_c[a_point] == '0'){
                    sum[sum_point--] = '1';
                    index = '0';
                }else {
                    sum[sum_point--] = '0';
                }
            }
            a_point--;
        }

        while (b_point >= 0){
            if (index == '0'){
                sum[sum_point--] = b_c[b_point];
            }else {
                if (b_c[b_point] == '0'){
                    sum[sum_point--] = '1';
                    index = '0';
                }else {
                    sum[sum_point--] = '0';
                }
            }
            b_point--;
        }

        if (index == '1'){
            sum[0] = '1';
            return new String(sum);
        }else {
            sum[0] = '0';
            return new String(Arrays.copyOfRange(sum, 1, sum.length));
        }
    }
}
