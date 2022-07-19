package simple;

import utils.TreeNode;

/**
 * 路径总和，给定一个二叉树节点与一个目标值，判断该数中是否存在一条路径和等于目标值
 *
 * 二叉树前序遍历，设定一个bool值判断值是否找到，每条路径结束记录一次
 *
 * 路径结束指当前节点的左右子节点都为空
 */

public class PathSum_0112 {

    public boolean flag = false;

    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        deep(root, 0, targetSum);
        return flag;
    }

    public void deep(TreeNode root, int current, int targetSum){
        if (root.left == null && root.right == null){
            if (current + root.val == targetSum){
                flag = true;
            }
        }else if (root.left == null){
            deep(root.right, current + root.val, targetSum);
        }else if (root.right == null){
            deep(root.left, current + root.val, targetSum);
        }else {
            deep(root.right, current + root.val, targetSum);
            deep(root.left, current + root.val, targetSum);
        }
    }
}
