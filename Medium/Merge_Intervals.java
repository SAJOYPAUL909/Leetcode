class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> li = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> (a[0] - b[0]));

        int arr[] = intervals[0];
        li.add(arr);

        for (int[] i : intervals) {
            if (arr[1] >= i[0])
                arr[1] = Math.max(arr[1], i[1]);

            else {
                arr = i;
                li.add(arr);

            }
        }
        return li.toArray(int[][]::new);
    }
}