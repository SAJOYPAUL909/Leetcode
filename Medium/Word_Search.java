class Solution {
    public boolean dfs(char arr[][] ,String w, int i, int j , int s )
    {
        if (i< 0 || i == arr.length || j < 0 || j == arr[0].length ||
            arr[i][j] != w.charAt(s) || arr[i][j] == '*')
            return false;
    
        if (s == w.length() -1)
            return true;

        char temp = arr[i][j];
        arr[i][j] = '*';

        boolean hai = dfs(arr,w,i+1,j,s+1) || dfs(arr,w,i-1,j,s+1) || 
                      dfs(arr,w,i,j+1,s+1) || dfs(arr,w,i,j-1,s+1)  ;
        
        arr[i][j] = temp;

        return hai;

        
    }


    public boolean exist(char[][] board, String word) 
    {
        for (int i = 0 ; i < board.length ; i++)
        {
            for (int j = 0 ; j < board[0].length ; j++)
            {
                if (dfs(board,word,i,j,0))
                    return true;
            }

        }
        return false;
        
    }
}