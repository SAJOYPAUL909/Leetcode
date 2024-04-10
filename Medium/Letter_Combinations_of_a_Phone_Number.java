class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty())
            return new ArrayList<>();

        List<String> ans = new ArrayList<>();
        ans.add("");

        String mem[] = { "", "", "abc", "def", "ghi", "jkl",
                "mno", "pqrs", "tuv", "wxyz" };

        for (char c : digits.toCharArray()) {
            List<String> temp = new ArrayList<>();
            for (String s : ans)
                for (char ch : mem[c - '0'].toCharArray())
                    temp.add(s + ch);
            ans = temp;
        }
        return ans;
    }
}