class Solution {
    public void rotate(int[][] matrix) {
        int k = matrix.length - 1;
        int l = 0;
        int arr[][] = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++, l++) {
            k = matrix.length - 1;
            for (int j = 0; j < matrix.length && k >= 0; j++, k--) {
                arr[i][j] = matrix[k][l];
            }

        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = arr[i][j];
            }

        }

    }
}