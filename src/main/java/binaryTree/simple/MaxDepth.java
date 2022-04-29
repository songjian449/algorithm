package binaryTree.simple;

import binaryTree.TreeNode;

/**
 * 二叉树的最大深度
 *
 * @link {https://leetcode-cn.com/problems/maximum-depth-of-binary-tree/}
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right);
    }
}
