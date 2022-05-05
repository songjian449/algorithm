package binaryTree.medium;

import binaryTree.TreeNode;

/**
 * 二叉搜索树中第K小的元素
 *
 * @link {https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/}
 */
public class KthSmallest {
    int rank = 0;
    int res = 0;

    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return res;
    }

    void traverse(TreeNode root, int k) {

        if (null == root) {
            return;
        }

        traverse(root.left, k);
        rank++;
        if (k == rank) {
            res = root.val;
            return;
        }
        traverse(root.right, k);
    }

}
