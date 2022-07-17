package simple;

import utils.TreeNode;

/**
 * 给定一个二叉树，求其最小深度
 *
 * 创建一个变量保存最小深度
 * 当遍历到叶子节点时，记录一次最小深度
 * 只执行非空节点
 */

public class MinimumDeepthOfBinaryTree_0111 {

    public int min = Integer.MAX_VALUE;

    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        deep(root, 1);
        return min;
    }

    public void deep(TreeNode root, int current) {
        if (root.left == null && root.right == null) {
            min = Math.min(min, current);
            return;
        }else if (root.left == null){
            deep(root.right, current + 1);
        }else if (root.right == null){
            deep(root.left, current + 1);
        }else {
            deep(root.right, current + 1);
            deep(root.left, current + 1);
        }
    }
}
