class Solution {
    public boolean canJump(int[] nums) {

        int l = nums.length - 1;
        for (int i = l - 1; i >= 0; i--) {
            if (i + nums[i] >= l)
                l = i;

        }
        if (l == 0)
            return true;
        else
            return false;
    }
}