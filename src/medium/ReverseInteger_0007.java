package medium;

/**
 * 给定一个32位有符号整数x，返回其数字部分翻转后的结果
 * 若返回结果超过int范围，则返回0
 *
 * 用Long接收Integer值
 */

public class ReverseInteger_0007 {
    public static void main(String[] args) {
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        char[] array1 = (x + "").toCharArray();
        if (x >= 0){
            for (int i = 0;i < array1.length / 2;i++){
                char temp = array1[i];
                array1[i] = array1[array1.length - 1 - i];
                array1[array1.length - 1 - i] = temp;
            }
        }else {
            for (int i = 1;i < (array1.length + 1) / 2;i++){
                char temp = array1[i];
                array1[i] = array1[array1.length - i];
                array1[array1.length - i] = temp;
            }
        }
        long ret = Long.parseLong(new String(array1));
        if (ret > Integer.MAX_VALUE || ret < Integer.MIN_VALUE){
            return 0;
        }else {
            return (int) ret;
        }
    }
}
