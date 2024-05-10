class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        int n = arr.length;
        double l = 0.0;
        double r = 1.0;

        while (l < r) {
            double m = (l + r) / 2;
            double max = 0.0;
            int sum = 0;
            int a = 0;
            int b = 0;

            for (int i = 0, j = 1; i < n - 1; i++) {
                while (j < n && arr[i] > m * arr[j])
                    j++;

                if (n == j)
                    break;

                sum += (n - j);
                double f = (double) arr[i] / arr[j];

                if (f > max) {
                    a = i;
                    b = j;
                    max = f;
                }
            }

            if (sum == k)
                return new int[] { arr[a], arr[b] };
            else if (sum > k)
                r = m;
            else
                l = m;
        }
        return new int[] {};
    }
}