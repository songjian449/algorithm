package dfs;

/**
 * 岛屿数量
 *
 * @link {https://leetcode.cn/problems/number-of-islands/}
 */
public class NumIslands {

    public int numIslands(char[][] grid) {

        int row = grid.length;
        int col = grid[0].length;

        int res = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                // 陆地
                if (grid[i][j] == '1') {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    public void dfs(char[][] grid, int i, int j) {


        int row = grid.length;
        int col = grid[0].length;

        if (i < 0 || j < 0 || i >= row || j >= col) {
            return;
        }

        if (grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        dfs(grid, i - 1, j); // 上
        dfs(grid, i, j - 1); // 左
        dfs(grid, i + 1, j); // 下
        dfs(grid, i, j + 1); // 右
    }
}
