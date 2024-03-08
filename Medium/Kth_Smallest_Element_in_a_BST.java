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
    public int kthSmallest(TreeNode root, int k) {
        scan(root, k);
        return ans;
    }

    int ans = -1;
    int count = 1;

    void scan(TreeNode root, int k) {
        if (root == null)
            return;

        scan(root.left, k);
        if (count++ == k) {
            ans = root.val;
            return;
        }
        scan(root.right, k);
    }
}