package binaryTree.medium;

import binaryTree.TreeNode;

/**
 * 二叉树的最近公共祖先
 *
 * @link {https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/}
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(null == root){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(null == left && null != right){
            return right;
        }

        if(null != left && null == right){
            return left;
        }

        if(null != left && null != right){
            return root;
        }

        return null;
    }
}
