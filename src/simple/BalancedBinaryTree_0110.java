package simple;

import utils.TreeNode;

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树
 *
 * 判断条件：其左右子树高度差是否不大于1 && 左子树是否是高度平衡二叉树 && 右子树是否是高度平衡二叉树
 */

public class BalancedBinaryTree_0110 {
    public static void main(String[] args) {

    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(deep(root.left) - deep(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public int deep(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(deep(root.right), deep(root.left));
    }
}
