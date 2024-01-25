class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;
        int count = 0;

        Map<Character, Character> sa = new HashMap<>();
        Set<Character> ta = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (sa.containsKey(s.charAt(i))) {
                if (sa.get(s.charAt(i)) != t.charAt(i))
                    return false;
            } else {
                if (ta.contains(t.charAt(i)))
                    return false;
            }
            sa.put(s.charAt(i), t.charAt(i));
            ta.add(t.charAt(i));
        }

        return true;
    }
}