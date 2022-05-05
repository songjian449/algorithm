package binaryTree.medium;

import binaryTree.Node;

/**
 * 填充每一个节点的下一个右侧指针
 *
 * @link {https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/}
 */
public class Connect {
    public Node connect(Node root) {
        if (null == root){
            return null;
        }
        traverse(root.left, root.right);
        return root;
    }

    void traverse(Node node1, Node node2) {
        if (null == node1 || null == node2) {
            return;
        }
        node1.next = node2;
        traverse(node1.left, node1.right);
        traverse(node2.left, node2.right);
        traverse(node1.right, node2.left);
    }
}
