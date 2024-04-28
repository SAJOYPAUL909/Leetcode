class Solution {
    public int[] sumOfDistancesInTree(int n, int[][] edges) {
        int ans[] = new int[n];
        int count[] = new int[n];

        Set<Integer> tree[] = new Set[n];
        Arrays.fill(count, 1);

        for (int i = 0; i < n; i++) {
            tree[i] = new HashSet<>();
        }

        for (int e[] : edges) {
            int u = e[0];
            int v = e[1];
            tree[u].add(v);
            tree[v].add(u);
        }
        postorder(tree, 0, -1, count, ans);
        preorder(tree, 0, -1, count, ans);
        return ans;
    }

    public void postorder(Set<Integer>[] tree, int n, int p, int count[], int ans[]) {
        for (int c : tree[n]) {
            if (c == p)
                continue;
            postorder(tree, c, n, count, ans);
            count[n] += count[c];
            ans[n] += ans[c] + count[c];
        }

    }

    public void preorder(Set<Integer>[] tree, int n, int p, int count[], int ans[]) {
        for (int c : tree[n]) {
            if (c == p)
                continue;
            ans[c] = ans[n] - count[c] + (tree.length - count[c]);
            preorder(tree, c, n, count, ans);
        }
    }
}