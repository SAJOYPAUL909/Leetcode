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
    int ans = 0;

    public int sumNumbers(TreeNode root) {
        sum(root, 0);
        return ans;

    }

    public void sum(TreeNode root, int sum) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            ans += sum * 10 + root.val;
            return;
        }
        sum(root.left, sum * 10 + root.val);
        sum(root.right, sum * 10 + root.val);

    }

}