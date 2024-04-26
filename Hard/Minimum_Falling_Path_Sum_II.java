class Solution {
    public int minFallingPathSum(int[][] grid) {
        int n = grid.length;
        int[][] arr = new int[n + 1][n];
        int max = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                int x = max;
                for (int k = 0; k < n; k++) {
                    if (k != j) {
                        x = Math.min(x, arr[i - 1][k]);
                    }
                }
                arr[i][j] = grid[i - 1][j] + (x == max ? 0 : x);
            }
        }
        int ans = max;
        for (int x : arr[n]) {
            ans = Math.min(ans, x);
        }
        return ans;

    }
}