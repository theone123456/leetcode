package simple;

/**
 * 给定一个整数，不使用函数求平方根
 *
 * 二分法，注意细节
 */

public class SqrtX_0069 {
    public static void main(String[] args) {
        int x = 6;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {

        int left = 0;
        int right = x;
        int ret = -1;   // 控制住返回值，不用在返回时再比较

        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long) mid * mid <= x) {
                ret = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return ret;
    }
}
