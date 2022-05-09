package binaryTree.medium;

import binaryTree.TreeNode;

/**
 * 验证二叉搜索树
 *
 * @link {https://leetcode-cn.com/problems/validate-binary-search-tree/}
 */
public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    boolean isValidBST(TreeNode root, TreeNode min, TreeNode max) {
        if (null == root) {
            return true;
        }
        if (null != min && min.val >= root.val) {
            return false;
        }
        if (null != max && max.val <= root.val) {
            return false;
        }
        return isValidBST(root.left, null, root) &&
                isValidBST(root.right, root, null);
    }
}
