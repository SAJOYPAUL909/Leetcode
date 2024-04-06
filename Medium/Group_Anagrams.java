class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ana = new HashMap<>();

        for (String s : strs) {
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);

            if (!ana.containsKey(key))
                ana.put(key, new ArrayList<>());

            ana.get(key).add(s);
        }

        return new ArrayList<>(ana.values());

    }
}