class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        dfs(nums, new boolean[nums.length], new ArrayList<>(), ans);
        return ans;
    }

    public void dfs(int[] nums, boolean[] vis,
            List<Integer> arr, List<List<Integer>> ans) {
        if (arr.size() == nums.length) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (vis[i])
                continue;
            vis[i] = true;
            arr.add(nums[i]);
            dfs(nums, vis, arr, ans);
            arr.remove(arr.size() - 1);
            vis[i] = false;
        }
    }
}