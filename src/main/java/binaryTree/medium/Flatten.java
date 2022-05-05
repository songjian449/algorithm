package binaryTree.medium;

import binaryTree.TreeNode;

/**
 * 二叉树展开为链表
 *
 * @link {https://leetcode-cn.com/problems/flatten-binary-tree-to-linked-list/}
 */
public class Flatten {
    // 方法定义：将root节点的左右子树重组成链表
    public void flatten(TreeNode root) {

        if (null == root) {
            return;
        }
        flatten(root.left);
        flatten(root.right);

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = left;

        TreeNode tmp = root;
        while (null != tmp.right) {
            tmp = tmp.right;
        }
        tmp.right = right;
    }
}
