class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> li = new ArrayList<>();
        int i = 0;

        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            li.add(intervals[i++]);
        }
        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        li.add(newInterval);

        while (i < intervals.length) {
            li.add(intervals[i++]);
        }
        return li.toArray(int[][]::new);
    }
}