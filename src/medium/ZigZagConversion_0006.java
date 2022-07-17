package medium;

/**
 * 给定一个字符串和指定的行数，返回纵向Z字输出
 */

public class ZigZagConversion_0006 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));
    }

    public static String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        int len = s.length();
        int u_width = numRows - 1;  // 单位宽度
        int u_sum = 2 * numRows - 2;
        int u = len % u_sum == 0 ? len / u_sum : (len / u_sum) + 1;   // 单位
        char[] letters = s.toCharArray();
        char[][] array = new char[numRows][u * u_width];
        int row = 0, col = 0;
        int index = 0;
        for (int i = 0;i < len;i++){
            array[row][col] = letters[i];
            index++;
            if (index == u_sum){
                index = 0;
                row--;
                col++;
            }else if (index < numRows){
                row++;
            }else if (index < u_sum){
                row--;
                col++;
            }
        }
        String ret = "";
        for (int i = 0;i < numRows;i++){
            for (int j = 0;j < u * u_width;j++){
                if (array[i][j] != '\u0000'){
                    ret += array[i][j];
                }
            }
        }
        return ret;
    }
}
