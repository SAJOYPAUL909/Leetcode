class Solution {
    public int lengthOfLIS(int[] nums) {
        int arr[] = new int[nums.length];

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && (arr[j] + 1 > arr[i]))
                    arr[i] = arr[j] + 1;
            }
        }

        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[end])
                end = i;
        }
        return arr[end] + 1;

    }
}