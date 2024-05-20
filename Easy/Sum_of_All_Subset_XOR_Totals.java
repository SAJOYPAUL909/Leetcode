class Solution {
    public int subsetXORSum(int[] nums) {
        return dfs(nums,0,0);
    }

    public int dfs(int nums[],int i, int xor)
    {
        if (i == nums.length)
            return xor;
        
        int x = dfs(nums,i+1,xor);
        int y = dfs(nums,i+1,nums[i]^xor);
        return x+y;
    }
}