package binaryTree.simple;

import binaryTree.TreeNode;

/**
 * 合并二叉树
 *
 * @link {https://leetcode-cn.com/problems/merge-two-binary-trees/}
 */
public class MergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (null == root1){
            return root2;
        }
        if (null == root2){
            return root1;
        }
        TreeNode treeNode = new TreeNode(root1.val + root2.val);
        treeNode.left = mergeTrees(root1.left, root2.left);
        treeNode.right = mergeTrees(root1.right, root2.right);
        return treeNode;
    }
}
