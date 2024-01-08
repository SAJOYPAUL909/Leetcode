class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        int k = 1;
        int l = 1;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
        }

        if (count > 1) {
            k = 0;
            l = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                l = 0;
            } else {
                k = k * nums[i];
                l = l * nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                ans[i] = k;
            else
                ans[i] = l / nums[i];
        }
        return ans;
    }
}