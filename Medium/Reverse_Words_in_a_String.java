class Solution {
    public String reverseWords(String s) {
        String a = s.trim();
        String ans = "";
        String str[] = new String[s.length()];

        int j = 0;

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == ' ') {
                str[j++] = ans.trim();
                ans = "";
            }
            ans += a.charAt(i);
        }
        ans += " ";
        for (int i = str.length - 1; i >= 0; i--) {
            if (str[i] == null || str[i] == "") {
                continue;
            }
            ans += str[i] + " ";
        }
        return ans.trim();
    }
}