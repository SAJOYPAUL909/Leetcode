class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];

        int ans = 0;

        left[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            if (left[i - 1] > height[i]) {
                left[i] = left[i - 1];
            } else {
                left[i] = height[i];
            }
        }

        right[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            if (height[i] > right[i + 1]) {
                right[i] = height[i];
            } else {
                right[i] = right[i + 1];
            }
        }

        for (int i = 0; i < height.length; i++) {
            ans += (Math.min(right[i], left[i])) - height[i];
        }

        return ans;
    }
}