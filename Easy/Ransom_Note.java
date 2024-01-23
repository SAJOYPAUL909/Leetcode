class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> li = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            li.put(magazine.charAt(i), li.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        int i = 0;
        while (i < ransomNote.length()) {
            if (!li.containsKey(ransomNote.charAt(i)))
                return false;

            else {
                li.put(ransomNote.charAt(i), li.get(ransomNote.charAt(i)) - 1);

                if (li.get(ransomNote.charAt(i)) == 0) {
                    li.remove(ransomNote.charAt(i));
                }
                i++;
            }
        }
        return true;
    }
}