/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node N = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (N != null) {
            map.put(N, new Node(N.val));
            N = N.next;
        }
        N = head;
        while (N != null) {
            map.get(N).next = map.get(N.next);
            map.get(N).random = map.get(N.random);
            N = N.next;
        }
        return map.get(head);
    }

}