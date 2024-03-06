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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        if (root == null)
        return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>(Arrays.asList(root));
        boolean dir = true;

        while(!q.isEmpty())
        {
            List<Integer> l = new ArrayList<>();
            for (int n = q.size() ;n > 0 ;n--)
            {
                TreeNode node = q.poll();
                if (dir)
                    l.add(node.val);   
                else
                    l.add(0,node.val);
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);               
            }
            ans.add(l);
            dir = !dir;
        }
        return ans;
    }
}