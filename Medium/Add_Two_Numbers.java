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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode first = new ListNode(0);
        ListNode one = first;
        int a = 0;
        while (l1 != null || l2 != null || a > 0) {
            if (l1 != null) {
                a += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                a += l2.val;
                l2 = l2.next;
            }
            first.next = new ListNode(a % 10);
            a /= 10;
            first = first.next;
        }
        return one.next;

    }
}