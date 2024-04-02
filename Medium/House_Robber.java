class Solution {
    public int rob(int[] nums) 
    {
        if (nums.length == 1)
            return nums[0];

        int i = 2; 
        int arr[] = new int[nums.length];
        arr[0]=nums[0];
        arr[1] = Math.max(nums[0],nums[1]);

        while (i < nums.length)
        {
            arr[i] = Math.max(nums[i]+arr[i-2],arr[i-1]);
            i++;
        }
        return arr[nums.length -1];
        
    }
}