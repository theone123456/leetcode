package simple;

/**
 * 验证给定字符串是否是回文串，只考虑字母和数字，忽略大小写
 *
 * 先对字符串进行处理再进行判断
 */

public class ValidPalindrome_0125 {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        if (" ".equals(s)) return true;
        String newStr = s.toLowerCase();
        char[] array = newStr.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i]) || Character.isAlphabetic(array[i])){
                buffer.append(array[i]);
            }
        }
        char[] newArray = buffer.toString().toCharArray();
        for (int i = 0, j = newArray.length - 1;i <= j;i++, j--){
            if (newArray[i] != newArray[j]) return false;
        }
        return true;
    }
}
