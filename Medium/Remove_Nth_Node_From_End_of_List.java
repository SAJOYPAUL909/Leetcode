/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode l = head;
        while (n > 0) {
            l = l.next;
            n--;
        }

        ListNode curr = head;
        if (l == null)
            return head.next;

        while (l.next != null) {
            curr = curr.next;
            l = l.next;
        }
        curr.next = curr.next.next;
        return head;
    }
}