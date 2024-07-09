
class Solution {
    public long maximumImportance(int n, int[][] roads) 
    {
        long ans = 0;
        long count[] = new long[n];
        
        for(int[] i : roads)
        {
            int u = i[0];
            int v = i[1];
            count[u]++;
            count[v]++;
        }

        Arrays.sort(count);
        for(int i= 0 ; i < n ; i++)
        {
            ans += (i+1)*count[i];
        }
        return ans;
    }
}