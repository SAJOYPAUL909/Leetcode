class Solution {
    public int longestIdealString(String s, int k) {
        if (s.length() < 2)
            return 1;

        int n = s.length();
        int ans = 0;

        int arr[] = new int[n];
        Arrays.fill(arr, 1);

        HashMap<Character, Integer> map = new HashMap<>(26);

        map.put(s.charAt(0), 0);

        for (int i = 1; i < n; i++) {
            char a = s.charAt(i);
            for (char b = 'a'; b <= 'z'; b++) {
                if (Math.abs(a - b) > k)
                    continue;

                if (map.containsKey(b))
                    arr[i] = Math.max(arr[i], arr[map.get(b)] + 1);
            }
            map.put(a, i);
            ans = Math.max(ans, arr[i]);
        }
        return ans;

    }
}