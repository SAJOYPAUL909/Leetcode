/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    Node pre, next;

    public void change(Node cur) {
        if (cur == null)
            return;

        if (next == null)
            next = cur;
        if (pre != null)
            pre.next = cur;

        pre = cur;
    }

    public Node connect(Node root) {
        Node node = root;
        while (node != null) {
            pre = null;
            next = null;
            while (node != null) {
                change(node.left);
                change(node.right);
                node = node.next;
            }
            node = next;
        }
        return root;
    }

}