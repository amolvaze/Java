// Code to swap singly LL nodes in pairs 

// Given 1->2->3->4, you should return the list as 2->1->4->3.

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
    public ListNode swapPairs(ListNode head) {
        
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode current= temp;
        
        while(current.next!= null && current.next.next!=null) {
            ListNode first= current.next;
            ListNode second = current.next.next;
            first.next = second.next;
            current.next = second;
            current.next.next = first;
            current= current.next.next;
        }
        
        return temp.next;
    }
}
