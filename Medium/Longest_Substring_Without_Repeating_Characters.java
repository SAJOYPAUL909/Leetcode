class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] visited = new int[256];
            for (int j = i; j < s.length(); j++) {
                if (visited[s.charAt(j)] == 1) {
                    break;
                } else {
                    count = Math.max(count, j - i + 1);
                    visited[s.charAt(j)] = 1;

                }

            }
            visited[s.charAt(i)] = 0;
        }
        return count;
    }
}