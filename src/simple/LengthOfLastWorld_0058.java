package simple;

/**
 * 给定一个字符串s，其由单词和" "组成，求最后一个单词的长度
 */

public class LengthOfLastWorld_0058 {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
