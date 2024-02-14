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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode l = new ListNode(0, head);
        ListNode pre = l;

        while (head != null) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            if (pre.next == head) {
                pre = pre.next;
            } else {
                pre.next = head.next;
                head = head.next;
            }
        }
        return l.next;
    }
}