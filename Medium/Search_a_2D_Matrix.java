class Solution {
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;

        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0;
        int r = m * n;
        while (l < r) {
            int mid = (r + l) / 2;
            int i = mid / m;
            int j = mid % m;

            if (matrix[i][j] == target)
                return true;
            if (matrix[i][j] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }

        }
        return false;

    }
}