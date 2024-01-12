class Solution {
    public int lengthOfLastWord(String s) {
        String a = s.trim();

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == ' ') {
                count = 0;
            } else {
                count++;
            }
        }

        return count;
    }
}