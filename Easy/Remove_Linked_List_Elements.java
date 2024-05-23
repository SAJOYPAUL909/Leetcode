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
    public ListNode removeElements(ListNode head, int val) 
    {
        ListNode Temp = new ListNode(0,head);
        ListNode cur = Temp;

        while(head != null)
        {
            if (head.val != val)
            {
                cur. next = head;
                cur = cur.next;
            }
            head = head.next;
        }
        cur.next = null;
        return Temp.next;
       
        
    }
}