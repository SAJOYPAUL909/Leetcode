class Solution {
    public void rotate(int[] nums, int k) {
        int arr[] = new int[nums.length];
        int l = nums.length - 1;
        int j = 0;
        while (k > nums.length) {
            k = k - nums.length;
        }

        for (int i = nums.length - k - 1; i >= 0; i--) {
            arr[l--] = nums[i];
        }
        for (int i = nums.length - k; i < nums.length; i++) {
            arr[j++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

    }
}