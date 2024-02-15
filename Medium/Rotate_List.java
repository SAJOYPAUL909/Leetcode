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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int count;
        ListNode high = head;
        for (count = 1; high.next != null; count++)
            high = high.next;

        high.next = head;

        int t = count - k % count;
        for (int i = 0; i < t; i++)
            high = high.next;

        ListNode low = high.next;
        high.next = null;

        return low;
    }
}   