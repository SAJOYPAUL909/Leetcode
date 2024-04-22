class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) 
    {
        int ans[] = new int[2];
        for (int i = 0 ; i < mat.length ; i++)
        {
            int one = 0;
            for (int  j = 0 ; j < mat[0].length ; j++)
            {
                if (mat[i][j] == 1)
                    one++;
            }
            if (one > ans[1])
            {
                ans[0] = i;
                ans[1] = one;
            }
        }
        return ans;
    }
}