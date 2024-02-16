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
    public ListNode partition(ListNode head, int x) 
    {   
        ListNode list1 = new ListNode(0);
        ListNode l1 = list1;
        ListNode list2 = new ListNode(0);
        ListNode l2 = list2;

        for (;head != null;head = head.next)
        {   if (head.val < x)
            {   
                l2.next = head;
                l2 = head;
            }
            else
            {
                l1.next = head;
                l1 = head;
            }
        } 

        l1.next = null;
        l2.next = list1.next;

        return list2.next; 
    }
}