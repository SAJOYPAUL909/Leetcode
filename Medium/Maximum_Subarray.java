class Solution {
    public int maxSubArray(int[] nums) 
    {
        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (int i : nums)
        {
            sum = Math.max(i, sum + i);
            ans = Math.max(sum,ans);
        }
        return ans;
        
    }
}
