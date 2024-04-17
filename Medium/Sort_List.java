/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) 
    {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;

        ListNode l1 = sortList(head);
        ListNode l2 = sortList(temp);

        ListNode ans = new ListNode(0);
        ListNode cur = ans;

        while(l1 != null && l2 != null)
        {
            if (l1.val <= l2.val)
                {
                    cur.next = l1;
                    l1 = l1.next;
                }
            else
                {
                    cur.next = l2;
                    l2 = l2.next;
                }
            cur = cur.next;
        }

        if (l1 == null)
            cur.next = l2;
        else
            cur.next = l1;

        return ans.next;
        
    }
}