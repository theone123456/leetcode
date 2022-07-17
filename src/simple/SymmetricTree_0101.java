package simple;

import utils.TreeNode;

/**
 * 给定一个二叉树根节点，判断该二叉树是否对称
 *
 * 与判断两树是否相同一致，左右节点比较
 */

public class SymmetricTree_0101 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return solve(root.left, root.right);
    }

    public boolean solve(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }else if (p == null || q == null){
            return false;
        }else if (p.val != q.val){
            return false;
        }else {
            return solve(p.left, q.right) && solve(p.right, q.left);
        }
    }
}
