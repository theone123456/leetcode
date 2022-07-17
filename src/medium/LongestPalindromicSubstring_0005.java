package medium;

/**
 * 最长回文子串
 *
 * 动态规划
 * 外层循环遍历字符串长度，从2开始（长度<2的字符串都是回文串）
 * 内层循环遍历起始位置，即左边界
 *
 * 动态转移方程 dp[i][j] = (s[i] == s[j]) && dp[i + 1][j - 1]
 *
 */

public class LongestPalindromicSubstring_0005 {
    public static void main(String[] args) {

    }

    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;

        int maxLen = 1, begin = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0;i < len;i++){
            dp[i][i] = true;
        }
        char[] array = s.toCharArray();
        for (int i = 2;i <= len;i++){    // 子串长度
            for (int j = 0;j < len;j++){    // 左边界
                int k = j + i - 1;  // 右边界
                if (k >= len) break;
                if (array[j] == array[k]){
                    if (k - j < 3){
                        dp[j][k] = true;
                    }else {
                        dp[j][k] = dp[j + 1][k - 1];
                    }
                }
                if (dp[j][k] && k - j + 1 > maxLen){
                    maxLen = k - j + 1;
                    begin = j;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }
}
