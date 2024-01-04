class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 0, l = 0;
        int arr[] = new int[nums.length];

        for (i = 0; i < nums.length; i++) {
            int count = 0;
            for (j = i; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    count++;
            }
            if (count <= 2) {
                arr[l++] = nums[i];
            }
        }
        for (i = 0; i < l; i++) {
            nums[i] = arr[i];
        }
        return (l);

    }
}