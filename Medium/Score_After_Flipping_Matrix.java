    class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int ans = m;

        for (int j = 1; j < n; j++) {
            int one = 0;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == grid[i][0])
                    one += 0;
                else
                    one += 1;
            }
            ans = ans * 2 + Math.max(one, m - one);
        }
        return ans;

    }
}