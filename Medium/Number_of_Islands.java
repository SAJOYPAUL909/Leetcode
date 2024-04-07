class Solution {
    
    public void dfs(char arr[][],int i,int j)
    {
        if ( i < 0 || i == arr.length || j <0 || j  == arr[0].length)
            return;
        
        if (arr[i][j] != '1')
            return;

        arr[i][j] = '2';
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
    } 

    public int numIslands(char[][] grid) 
    {
        int ans = 0;
        for(int i =0 ; i < grid.length ; i++)
        {
            for (int j =0 ; j < grid[0].length ; j++)
            {
                if (grid[i][j] == '1')
                {
                    dfs(grid,i,j);
                    ans++;
                }
            }
        }
        return ans;
    }
}