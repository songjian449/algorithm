package binaryTree.simple;

import binaryTree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 *
 * @link {https://rleetcode-cn.com/problems/binary-tree-inorder-traversal/}
 */
public class BinaryTree {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    public void dfs(TreeNode treeNode, ArrayList arrayList){
        if (null == treeNode){
            return;
        }
        dfs(treeNode.left, arrayList);
        arrayList.add(treeNode.val);
        dfs(treeNode.right, arrayList);
    }

}
