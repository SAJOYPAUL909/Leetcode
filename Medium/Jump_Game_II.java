class Solution {
    public int jump(int[] nums) {
        int l = nums.length;
        int j = 0;
        int n = -1;
        int count = 0;
        for (int i = 0; i < l - 1; i++) {
            n = Math.max(n, nums[i] + i);
            if (i == j) {
                count++;
                j = n;
            }
        }
        return count;
    }
}