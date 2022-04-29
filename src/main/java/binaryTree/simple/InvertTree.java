package binaryTree.simple;

import binaryTree.TreeNode;

/**
 * 翻转二叉树
 *
 * @link {https://leetcode-cn.com/problems/invert-binary-tree/}
 */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
