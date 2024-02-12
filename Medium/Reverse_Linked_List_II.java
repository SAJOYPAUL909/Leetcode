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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode l = new ListNode(0, head);
        ListNode curr = l;

        for (int i = 1; i < left; i++)
            curr = curr.next;

        ListNode tail = curr.next;
        for (int i = 0; i < right - left; i++) {
            ListNode pre = tail.next;
            tail.next = pre.next;
            pre.next = curr.next;
            curr.next = pre;

        }
        return l.next;

    }
}