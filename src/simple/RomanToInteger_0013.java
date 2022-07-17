package simple;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个罗马数字，将其转换为整数
 *
 * 个人认为这题本身有bug，eg MCCM是MCC+M还是M+CCM
 */

public class RomanToInteger_0013 {
    public static void main(String[] args) {
        String s = "MCCM";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ret = 0;
        char[] romans = s.toCharArray();
        for (int i = 0; i < romans.length; i++) {
            if (i == 0){
                ret += map.get(romans[i]);
                continue;
            }
            if (map.get(romans[i]) > map.get(romans[i - 1])){
                ret = ret - map.get(romans[i - 1]) + map.get(romans[i]) - map.get(romans[i - 1]);
            }else {
                ret += map.get(romans[i]);
            }
        }
        return ret;
    }
}
