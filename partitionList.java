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

// Time Complexity - O(n) 

// Space Complexity - O(1)

//Input: head = 1->4->3->2->5->2, x = 3
//Output: 1->2->2->4->3->5

class Solution {
    public ListNode partition(ListNode head, int x) {
        
        ListNode before_head = new ListNode(0);
        ListNode before = before_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;
        
        while(head !=null)
        {
            if(head.val < x)
            {
                before.next = head;
                before = before.next;
            }
            else
            {
                after.next = head;
                after = after.next;
            }
            
         head = head.next;
        }
        
        after.next = null;
        before.next = after_head.next;
        return before_head.next;
        
    }
}
