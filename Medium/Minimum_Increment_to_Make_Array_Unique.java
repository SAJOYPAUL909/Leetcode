class Solution {
    public int minIncrementForUnique(int[] nums) 
    {
        int ans =0;
        int temp =0;
        Arrays.sort(nums);
        for(int i :nums)
        {
            ans += Math.max(temp - i ,0);
            temp = Math.max(temp,i)+1;
        }   
        return ans;
    }
}