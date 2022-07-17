package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串s，找出其中不含重复字符的最长子串长度
 *
 * 快慢指针：快指针进行遍历，慢指针指向最长子串最左边
 * 构建map存储出现过的字符及其最近一次出现的位置
 *
 * 慢指针当且仅当遇到重复字符时，且重复字符大于等于慢指针指向位置时才移动
 * 慢指针移动至上次出现位置的下一位
 *
 * 当一次遍历慢指针没有移动，则更新最长子串长度
 */

public class LongestSubstringWithoutRepeatingCharacters_0003 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;
        int max = 0, low = 0, fast = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (fast < s.length()){
            if (map.containsKey(s.charAt(fast)) && map.get(s.charAt(fast)) >= low){
                low = map.get(s.charAt(fast)) + 1;
            }else {
                max = Math.max(max, fast - low + 1);
            }
            map.put(s.charAt(fast), fast);
            fast++;
        }
        return max;
    }
}
