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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        ListNode temp = new ListNode(0);
        ListNode cur = temp;

        Queue<ListNode> heap = new PriorityQueue<>((a,b)->a.val-b.val);

        for(ListNode l :lists)
            {
                if(l != null)
                heap.add(l);
            }

        while(!heap.isEmpty())
        {
            ListNode min = heap.poll();
            if(min.next!= null)
                heap.add(min.next);

            cur.next = min;
            cur = cur.next;
        }
        return temp.next;
    }
}