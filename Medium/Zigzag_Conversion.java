class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String str = "";

        for (int i = 0; i < numRows; i++) {
            for (int j = i; j < s.length(); j += 2 * (numRows - 1)) {
                str += s.charAt(j);
                if (i != 0 && i != numRows - 1) {
                    int k = j + ((2 * numRows - 1) - 2 * i) - 1;
                    if (k < s.length())
                        str += s.charAt(k);
                }
            }
        }
        return str;
    }
}