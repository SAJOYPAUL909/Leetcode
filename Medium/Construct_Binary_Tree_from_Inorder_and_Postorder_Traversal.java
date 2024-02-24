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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return Split(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map);
    }

    public TreeNode Split(int in[], int inS, int inE,
            int post[], int postS, int postE,
            Map<Integer, Integer> map) {
        if (inS > inE)
            return null;

        int index = post[postE];
        int mid = map.get(index);

        TreeNode root = new TreeNode(index);

        root.left = Split(in, inS, mid - 1, post, postS, postS + mid - inS - 1, map);
        root.right = Split(in, mid + 1, inE, post, postS + mid - inS, postE - 1, map);

        return root;

    }

}