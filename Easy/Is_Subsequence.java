class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        int count = 0;
        if (s.length() == 0) {
            return true;
        }
        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
                count++;

            }
        }
        if (count == s.length()) {
            return true;
        }
        return false;
    }
}