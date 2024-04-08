class Solution {

    public void dfs(char a[][] , int i , int j)
    {
        if (i < 0 || j < 0 || i == a.length || j == a[0].length)
            return;

        if (a[i][j] != 'O')
            return;
      
        a[i][j] = '*';

        dfs(a,i+1,j);
        dfs(a,i-1,j);
        dfs(a,i,j+1);
        dfs(a,i,j-1);
    }



    public void solve(char[][] board) 
    {
        for (int i = 0 ; i < board.length ; i++)
            for(int j = 0 ; j < board[0].length ; j++)
                if (i*j == 0 || i == board.length -1 
                        || j == board[0].length - 1)
                    dfs(board,i,j);
       
       for (char[] row : board)
         for (int i = 0; i < row.length; i++)
            if (row[i] == '*')
                row[i] = 'O';
            else if (row[i] == 'O')
                row[i] = 'X';
        
    }
}