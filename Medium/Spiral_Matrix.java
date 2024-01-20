class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<>();
        int n = matrix[0].length;
        int m = matrix.length;

        int j = 0;
        int k = 0;
        while (k < m && j < n) {
            for (int i = j; i < n; i++) {
                li.add(matrix[j][i]);
            }
            k++;

            for (int i = k; i < m; i++) {
                li.add(matrix[i][n - 1]);
            }
            n--;

            if (k < m) {
                for (int i = n - 1; i >= j; i--) {
                    li.add(matrix[m - 1][i]);
                }
                m--;
            }
            if (j < n) {
                for (int i = m - 1; i >= k; i--) {
                    li.add(matrix[i][j]);
                }
                j++;
            }
        }
        return li;
    }
}