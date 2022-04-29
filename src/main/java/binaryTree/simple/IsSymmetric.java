package binaryTree.simple;

import binaryTree.TreeNode;

/**
 * 对称二叉树
 *
 * @link {https://leetcode-cn.com/problems/symmetric-tree/}
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode left, TreeNode right) {
        if (null == left && null == right) {
            return true;
        }

        if (null == left || null == right) {
            return false;
        }
        return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
    }
}
