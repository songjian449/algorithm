package binaryTree.medium;

/**
 * 不同的二叉搜索树
 *
 * @link {https://leetcode-cn.com/problems/unique-binary-search-trees/}
 */
public class NumTrees {
    public int numTrees(int n) {

        if (n <= 1) {
            return 1;
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += numTrees(i) * numTrees(n - i - 1);
        }
        return res;
    }
}
