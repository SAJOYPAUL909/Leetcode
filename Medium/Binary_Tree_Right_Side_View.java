/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    List<Integer> l = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0, l);
        return l;
    }

    public void dfs(TreeNode root, int i, List<Integer> l) {
        if (root == null)
            return;

        if (i == l.size())
            l.add(root.val);

        dfs(root.right, i + 1, l);
        dfs(root.left, i + 1, l);

    }
}