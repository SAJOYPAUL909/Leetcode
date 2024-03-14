    class Solution {
    int Find(int nums[], int target) {
        int i = 0;
        int j = nums.length;

        while (i < j) {
            int m = (i + j) / 2;
            if (nums[m] >= target)
                j = m;
            else
                i = m + 1;
        }
        return i;
    }

    public int[] searchRange(int[] nums, int target) {
        int i = Find(nums, target);
        if (i == nums.length || nums[i] != target)
            return new int[] { -1, -1 };
        int j = Find(nums, target + 1) - 1;
        return new int[] { i, j };
    }
}