import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        if (s.length() == 0 || words.length == 0)
            return new ArrayList<>();

        List<Integer> li = new ArrayList<>();
        Map<String, Integer> freq = new HashMap<>();

        for (String i : words)
            freq.put(i, freq.getOrDefault(i, 0) + 1);

        int tw = words.length;
        int lw = words[0].length();

        for (int i = 0; i <= s.length() - (tw * lw); i++) {
            Map<String, Integer> visited = new HashMap<>();

            for (int j = 0; j < tw; j++) {
                int index = i + j * lw;
                String w = s.substring(index, index + lw);
                visited.put(w, visited.getOrDefault(w, 0) + 1);
                if (visited.get(w) > freq.getOrDefault(w, 0)) {
                    break;
                }
                if (j + 1 == tw) {
                    li.add(i);
                }
            }
        }

        return li;
    }

}