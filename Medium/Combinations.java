class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();

        dfs(n, k, 1, new ArrayList<>(), ans);
        return ans;
    }

    public void dfs(int n, int k, int a,
            List<Integer> arr, List<List<Integer>> ans) {
        if (arr.size() == k) {
            ans.add(new ArrayList<>(arr));
            return;
        }

        for (int i = a; i <= n; i++) {
            arr.add(i);
            dfs(n, k, i + 1, arr, ans);
            arr.remove(arr.size() - 1);
        }
    }

}