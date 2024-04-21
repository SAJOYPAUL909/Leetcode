class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int sum = 0;
        int ans = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : nums) {
            total += i;
            sum = Math.max(sum + i, i);
            ans = Math.min(ans + i, i);
            max = Math.max(max, sum);
            min = Math.min(min, ans);
        }

        if (max > 0)
            return Math.max(max, total - min);
        else
            return max;

    }
}