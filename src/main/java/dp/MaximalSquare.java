package dp;

/**
 * 最大正方形
 *
 * @link {https://leetcode.cn/problems/maximal-square/}
 */
public class MaximalSquare {
    public int maximalSquare(char[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            dp[i][0] = matrix[i][0] - '0';
        }

        for (int i = 0; i < col; i++) {
            dp[0][i] = matrix[0][i] - '0';
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (matrix[i][j] == '0') {
                    continue;
                }
                int min = Math.min(dp[i - 1][j], dp[i][j - 1]);
                dp[i][j] = Math.min(min, dp[i - 1][j - 1]) + 1;
            }
        }
        int len = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                len = Math.max(len, dp[i][j]);
            }
        }
        return len * len;
    }
}
