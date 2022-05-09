package binaryTree.medium;

import binaryTree.TreeNode;

import java.util.*;

/**
 * 二叉树的层序遍历
 *
 * @link {https://leetcode-cn.com/problems/binary-tree-level-order-traversal/}
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (null == root) {
            return Collections.emptyList();
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        List<List<Integer>> res = new ArrayList<>();

        while (!nodeQueue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            int size = nodeQueue.size();
            for (int i = 0; i < size; i++) {

                TreeNode remove = nodeQueue.remove();
                tmp.add(remove.val);

                if (null != remove.left) {
                    nodeQueue.add(remove.left);
                }

                if (null != remove.right) {
                    nodeQueue.add(remove.right);
                }

            }
            res.add(tmp);
        }
        return res;
    }
}
