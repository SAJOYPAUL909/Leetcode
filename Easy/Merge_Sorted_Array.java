class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (j >= 0) {
            if (i < 0) {
                nums1[k--] = nums2[j--];
            } else {
                if (nums2[j] >= nums1[i]) {
                    nums1[k--] = nums2[j--];
                } else {
                    nums1[k--] = nums1[i--];
                }
            }
        }
    }
}
