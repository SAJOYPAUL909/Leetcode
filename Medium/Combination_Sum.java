class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void dfs(int s, int can[],int target,List<Integer> arr,List<List<Integer>> ans)
    {
        if (target < 0)
            return;

        if (target == 0)
            {
                ans.add(new ArrayList<>(arr));
                return;
            }

        for (int i = s; i <can.length ; i++)
        {
            arr.add(can[i]);
            dfs(i,can,target-can[i],arr,ans);
            arr.remove(arr.size()-1);
        }
    }
}