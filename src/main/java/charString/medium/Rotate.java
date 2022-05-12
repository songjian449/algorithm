package charString.medium;

/**
 * 旋转图像
 *
 * @link {https://leetcode.cn/problems/rotate-image/}
 */
public class Rotate {
    public void rotate(int[][] matrix) {

        int length = matrix.length;

        // 对角线反转
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
        }
        // 每列反转
        int left = 0;
        int right = matrix.length - 1;
        while (left < right) {
            for (int i = 0; i < length; i++) {
                int tmp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = tmp;
            }
            left++;
            right--;
        }
    }
}
