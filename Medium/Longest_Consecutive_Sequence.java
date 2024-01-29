import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        Arrays.sort(nums);
        int count = 1;
        int l = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                if (nums[i + 1] - nums[i] == 1) {
                    count++;
                    l = Math.max(l, count);
                } else {
                    l = Math.max(l, count);
                    count = 1;
                }
            }
            l = Math.max(l, count);
        }
        return l;
    }
}