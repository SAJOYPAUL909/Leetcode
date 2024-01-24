class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int l = Math.max(0, i - 1); l < Math.min(m, i + 2); l++) {
                    for (int k = Math.max(0, j - 1); k < Math.min(n, j + 2); k++) {
                        if (!(l == i && k == j)) {
                            if (board[l][k] == 1) {
                                count++;
                            }
                        }

                    }
                }
                arr[i][j] = count;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // board[i][j] = arr[i][j];
                if (board[i][j] == 1) {
                    if (arr[i][j] == 2 || arr[i][j] == 3) {
                        board[i][j] = 1;
                    } else {
                        board[i][j] = 0;
                    }

                } else if (board[i][j] == 0) {
                    if (arr[i][j] == 3) {
                        board[i][j] = 1;
                    }

                }
            }
        }

    }
}