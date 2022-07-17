package simple;

import utils.TreeNode;

/**
 * 将给定的升序数组转为平衡二叉树
 *
 * 其实暴力也能解，但是主要考察的是二分法
 */

public class ConvertSortedArrayToBinarySearchTree_0108 {
    public static void main(String[] args) {

    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return solve(nums, 0, nums.length - 1);
    }

    public TreeNode solve(int[] nums, int left, int right){
        if (left > right) return null;

        // 每次选取中间数字右边的节点作为根节点（也可选左边的）
        int mid = (left + right + 1) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = solve(nums, left, mid - 1);
        root.right = solve(nums, mid + 1, right);
        return root;
    }
}
