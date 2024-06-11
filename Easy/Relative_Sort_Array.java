class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[] = new int[arr1.length];
        int c[] = new int[1001];
        int k = 0;

        for (int i : arr1)
            c[i]++;

        for (int i : arr2)
            while (c[i]-- > 0)
                ans[k++] = i;

        for (int i = 0; i < 1001; i++) {
            while (c[i]-- > 0)
                ans[k++] = i;
        }
        return ans;

    }
}