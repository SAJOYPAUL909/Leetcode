class Solution {
    public String longestCommonPrefix(String[] strs) {
        String arr[] = new String[strs.length - 1];
        int l = 0;
        String s = "";

        if (strs.length == 0) {
            return strs[0];
        } else if (strs.length == 1) {
            return strs[0];
        }

        for (int i = 0; i < strs.length - 1; i++) {
            s = "";
            for (int j = 0; j <= strs[i].length() - 1 && j <= strs[i + 1].length() - 1; j++) {
                if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    s += strs[i].charAt(j);
                } else if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {
                    break;
                }
            }
            arr[i] = s;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[0].length() >= arr[i].length()) {
                arr[0] = arr[i];
            }
        }
        return arr[0];
    }

}