class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> m = new HashMap<>();
        String word[] = s.split(" ");

        if (pattern.length() != word.length)
            return false;

        for (int i = 0; i < word.length; i++) {
            if (m.containsKey(pattern.charAt(i))) {
                if (!word[i].equals(m.get(pattern.charAt(i))))
                    return false;
            } else {
                if (m.containsValue(word[i]))
                    return false;
            }
            m.put(pattern.charAt(i), word[i]);
        }
        return true;
    }
}