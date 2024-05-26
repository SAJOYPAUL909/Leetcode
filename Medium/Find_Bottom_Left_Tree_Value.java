/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    int l = 0;
    int ans = 0;
    public int findBottomLeftValue(TreeNode root) 
    {
        dfs(root,1);
        return ans;
    }

    public void dfs(TreeNode root , int d)
    {
        if (root == null)
            return;

        if (d > l)
        {
            l = d;
            ans = root.val;
        }

        dfs(root.left, d+1);
        dfs(root.right, d+1);
    }
}