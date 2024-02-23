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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);

        return split(preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1, map);
    }

    public TreeNode split(int pre[], int preS, int preE,
            int in[], int inS, int inE,
            Map<Integer, Integer> map) {

        if (preS > preE)
            return null;

        int mid = map.get(pre[preS]);
        int leftval = mid - inS;

        TreeNode root = new TreeNode(pre[preS]);

        root.left = split(pre, preS + 1, preS + leftval, in, inS, mid - 1, map);
        root.right = split(pre, preS + leftval + 1, preE, in, mid + 1, inE, map);

        return root;

    }
}