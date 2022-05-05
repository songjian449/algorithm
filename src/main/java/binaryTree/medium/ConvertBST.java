package binaryTree.medium;

import binaryTree.TreeNode;

/**
 * 把二叉搜索树转换为累加树
 *
 * @link {https://leetcode-cn.com/problems/convert-bst-to-greater-tree/}
 */
public class ConvertBST {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        traverse(root);
        return root;
    }

    void traverse(TreeNode root){
        if (null == root){
            return;
        }
        traverse(root.right);
        sum = sum + root.val;
        root.val = sum;
        traverse(root.left);
    }
}
