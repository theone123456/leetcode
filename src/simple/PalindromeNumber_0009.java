package simple;

/**
 * 给定一个整数x，如果x是一个回文整数，返回TRUE，否则返回FALSE
 */

public class PalindromeNumber_0009 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        char[] nums = (x + "").toCharArray();
        for (int i = 0;i <= nums.length / 2;i++){
            if (nums[i] != nums[nums.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
