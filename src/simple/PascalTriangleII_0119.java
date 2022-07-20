package simple;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角，给定一个数，返回杨辉三角所在行的值
 *
 * 从0开始
 */

public class PascalTriangleII_0119 {
    public static void main(String[] args) {

    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = create();
        return lists.get(rowIndex);
    }

    public static List<List<Integer>> create() {
        List<List<Integer>> out = new ArrayList<>();
        for (int i = 0; i < 33; i++) {
            if (i == 0) {
                List<Integer> in = new ArrayList<>();
                in.add(1);
                out.add(in);
            } else if (i == 1) {
                List<Integer> in = new ArrayList<>();
                in.add(1);
                in.add(1);
                out.add(in);
            } else {
                List<Integer> in = new ArrayList<>();
                in.add(1);
                List<Integer> last = out.get(i - 1);
                for (int j = 1; j < last.size(); j++) {
                    in.add(last.get(j - 1) + last.get(j));
                }
                in.add(1);
                out.add(in);
            }
        }
        return out;
    }
}
