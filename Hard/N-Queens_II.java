class Solution {
    int ans = 0;

    public int totalNQueens(int n) {
        dfs(n, 0, new boolean[n], new boolean[2 * n - 1], new boolean[2 * n - 1]);
        return ans;
    }

    public void dfs(int n, int i, boolean col[],
            boolean arr1[], boolean arr2[])

    {
        if (n == i) {
            ans++;
            return;
        }

        for (int j = 0; j < col.length; j++) {
            if (col[j] || arr1[i + j] || arr2[j - i + n - 1])
                continue;
            col[j] = arr1[i + j] = arr2[j - i + n - 1] = true;
            dfs(n, i + 1, col, arr1, arr2);
            col[j] = arr1[i + j] = arr2[j - i + n - 1] = false;

        }

    }
}