class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int arr[][] = new int[profits.length][2];
        for (int i = 0; i < profits.length; i++) {
            arr[i][0] = capital[i];
            arr[i][1] = profits[i];
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);

        int j = 0;
        while (k > 0) {
            while (j < profits.length && arr[j][0] <= w) {
                heap.add(arr[j][1]);
                j++;
            }
            if (heap.size() == 0)
                break;

            w += heap.poll();
            k--;
        }
        return w;
    }
}