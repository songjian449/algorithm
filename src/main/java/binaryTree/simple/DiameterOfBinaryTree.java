package binaryTree.simple;

import binaryTree.TreeNode;

/**
 * 二叉树的直径
 *
 * @link {https://leetcode-cn.com/problems/diameter-of-binary-tree/}
 */
public class DiameterOfBinaryTree {
    int maxDepth = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDepth;
    }

    public int maxDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        int curDepth = leftDepth + rightDepth;
        maxDepth = Math.max(curDepth, maxDepth);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
