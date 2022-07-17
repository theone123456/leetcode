package simple;

/**
 * 给定两个字符串haystack和needle，在haystack中needle第一次出现的第一个位置的下标
 * 若不存在则返回-1，needle为空字符串则返回0
 *
 * 直接调用已有方法
 * 重要的是解决方法
 */

public class ImplementStr_0028 {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle == "") return 0;
        return haystack.indexOf(needle);
    }
}
