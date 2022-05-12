package dfs;

/**
 * 岛屿的最大面积
 *
 * @link {https://leetcode.cn/problems/max-area-of-island/}
 */
public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {

        int row = grid.length;
        int col = grid[0].length;
        int area = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 1) {
                    area = Math.max(area, dfs(grid, i, j));
                }

            }
        }
        return area;
    }

    public int dfs(int[][] grid, int i, int j) {

        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return 0;
        }

        if (grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;

        return dfs(grid, i - 1, j) +
                dfs(grid, i, j - 1) +
                dfs(grid, i + 1, j) +
                dfs(grid, i, j + 1) + 1;
    }
}
