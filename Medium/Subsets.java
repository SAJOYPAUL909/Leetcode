class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(nums,0, new ArrayList<>(),ans);
        return ans;   
    }

    public void dfs(int nums[] , int s , List<Integer> temp , List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(temp));

        for (int i = s; i < nums.length ; i++)
        {
            temp.add(nums[i]);
            dfs(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}