class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length - k ];

        Queue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            heap.add(nums[i]);
            // heap.offer(nums[i]);

            while (heap.size() > k) {
                heap.remove();
                // heap.poll();
            }
        }
        return heap.peek();

    }
}