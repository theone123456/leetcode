package simple;

import java.util.Arrays;

/**
 * 直接调用Arrays.sort()方法
 */

public class MergeSortedArray_0088 {
    public static void main(String[] args) {

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0){
            for (int i = 0;i < n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        for (int i = 0;i < n;i++){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}
