/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode l = head;
        ListNode l2 = head;

        while (l != null && l.next != null) {
            l2 = l2.next;
            l = l.next.next;
            if (l == l2)
                return true;
        }
        return false;

    }
}