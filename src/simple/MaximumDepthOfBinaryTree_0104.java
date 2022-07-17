package simple;

import utils.TreeNode;

/**
 * 计算二叉树的最大深度
 *
 * 递归
 */

public class MaximumDepthOfBinaryTree_0104 {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}
