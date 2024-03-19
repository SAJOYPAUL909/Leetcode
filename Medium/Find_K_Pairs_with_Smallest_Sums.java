class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < Math.min(nums1.length, k); i++)
            q.add(new int[] { nums1[i] + nums2[0], i, 0 });

        List<List<Integer>> l = new ArrayList<>();
        while (!q.isEmpty() && k > 0) {
            int pair[] = q.poll();
            l.add(Arrays.asList(nums1[pair[1]], nums2[pair[2]]));
            k--;

            if (pair[2] + 1 < nums2.length) {
                q.add(new int[] { nums1[pair[1]] + nums2[pair[2] + 1],
                        pair[1], pair[2] + 1 });
            }
        }
        return l;
    }
}