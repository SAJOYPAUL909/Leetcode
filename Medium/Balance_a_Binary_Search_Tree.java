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
    public TreeNode balanceBST(TreeNode root) 
    {
        List<Integer> num = new ArrayList<>();
        inorder(root, num);
        return build(num, 0, num.size()-1);
        
    }
    public void inorder(TreeNode root, List<Integer>  num)
    {
        if (root == null)
            return;
        inorder(root.left, num);
        num.add(root.val);
        inorder(root.right, num);
    }

    public TreeNode build(List<Integer>  num, int l , int r)
    {
        if (l > r)
            return null;
        
        int m = (l+r)/2;
        return new TreeNode(num.get(m), build(num,l,m-1), build(num, m+1,r));
    }
}