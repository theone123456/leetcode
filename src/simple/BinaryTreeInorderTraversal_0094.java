package simple;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树中序遍历
 */

public class BinaryTreeInorderTraversal_0094 {
    public static void main(String[] args) {

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        midOrder(root, list);
        return list;
    }

    public static void midOrder(TreeNode root, List<Integer> list){
        if (root == null) return;
        midOrder(root.left, list);
        list.add(root.val);
        midOrder(root.right, list);
    }
}
