class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int count = nums.length + 1;
        int sum = nums[0];

        while (j < nums.length) {
            if (sum < target) {
                j++;
                if (j == nums.length)
                    break;
                sum += nums[j];
            } else {
                count = Math.min(count, j - i + 1);
                i++;
                sum -= nums[i - 1];
            }
        }
        if (count == nums.length + 1) {
            count = 0;
        }
        return count;
    }
}