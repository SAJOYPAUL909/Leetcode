class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long ans = 0;
        int count = 0;
        int res = Integer.MAX_VALUE;

        for (int i : nums) {
            ans += Math.max(i, i ^ k);
            count += ((i ^ k) > i) ? 1 : 0;
            res = Math.min(res, Math.abs(i - (i ^ k)));
        }

        if (count % 2 == 0)
            return ans;
        return ans - res;
    }
}