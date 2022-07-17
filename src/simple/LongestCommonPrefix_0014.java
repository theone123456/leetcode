package simple;

/**
 * 最长公共前缀，不存在则返回""
 */

public class LongestCommonPrefix_0014 {
    public static void main(String[] args) {
        String[] strs = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        if (strs.length == 1){
            return strs[0];
        }
        String ret = "";
        int index = 1;
        for (int i = 1;i <= strs[0].length();i++){
            for (int j = 1;j < strs.length;j++){
                if (!strs[j].startsWith(strs[0].substring(0, i))){
                    return ret;
                }
            }
            ret = strs[0].substring(0, i);
        }
        return ret;
    }
}
