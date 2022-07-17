package simple;

/**
 * 简单的动态规划
 *
 * 如果值是交替变化的，那么可以用两个变量进行接收
 * 避免额外空间与递归
 */

public class ClimbingStairs_0070 {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

    public static int climbStairs(int n) {
        if (n <= 2) return n;
        int a = 1, b = 2;
        for (int i = 3;i <= n;i++){
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
}
