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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> level = new LinkedList<>();
        level.add(root);
        level.add(null);

        List<Double> ans = new ArrayList<>();

        while (level.peek() != null) {
            double sum = 0;
            int n = 0;
            while (level.peek() != null) {
                TreeNode node = level.poll();
                sum += node.val;
                n++;

                if (node.left != null)
                    level.add(node.left);
                if (node.right != null)
                    level.add(node.right);
            }
            level.add(level.poll());
            ans.add(sum / n);
        }
        return ans;
    }
}