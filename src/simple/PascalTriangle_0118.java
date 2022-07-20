package simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角，即[1] [1,1] [1,2,1] [1,3,3,1]
 */

public class PascalTriangle_0118 {
    public static void main(String[] args) {
        int numRows = 1;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if (i == 0){
                List<Integer> in = new ArrayList<>();
                in.add(1);
                out.add(in);
            }else if (i == 1){
                List<Integer> in = new ArrayList<>();
                in.add(1);
                in.add(1);
                out.add(in);
            }
            else {
                List<Integer> in = new ArrayList<>();
                in.add(1);
                List<Integer> last = out.get(i - 1);
                for (int j = 1;j < last.size();j++){
                    in.add(last.get(j - 1) + last.get(j));
                }
                in.add(1);
                out.add(in);
            }
        }
        return out;
    }
}
