class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 0 || edges.length == 0)
            return new ArrayList<>(Arrays.asList(0));

        List<Integer> ans = new ArrayList<>();
        Map<Integer, Set<Integer>> g = new HashMap<>();

        for (int i = 0; i < n; i++)
            g.put(i, new HashSet<>());

        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            g.get(u).add(v);
            g.get(v).add(u);
        }

        for (Map.Entry<Integer, Set<Integer>> m : g.entrySet()) {
            int label = m.getKey();
            Set<Integer> child = m.getValue();
            if (child.size() == 1)
                ans.add(label);
        }

        while (n > 2) {
            n -= ans.size();
            List<Integer> leaf = new ArrayList<>();
            for (int l : ans) {
                int u = (int) g.get(l).iterator().next();
                g.get(u).remove(l);
                if (g.get(u).size() == 1)
                    leaf.add(u);
            }
            ans = leaf;
        }
        return ans;
    }
}