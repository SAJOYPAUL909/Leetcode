class Solution {
    public long maximumHappinessSum(int[] happiness, int k) 
    {
        long ans = 0;
        int n = happiness.length;
        int d = 0;

    Arrays.sort(happiness);
    
    for (int i = n-1 ; i >= n-k; i--)
    {
        ans += Math.max(0,happiness[i] - d);
        d++; 
    }
    return ans;
        
    }
}