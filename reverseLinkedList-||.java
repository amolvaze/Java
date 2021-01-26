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

// Input: 1->2->3->4->5->NULL, m = 2, n = 4
// Output: 1->4->3->2->5->NULL


class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null)
            return null;
        
        ListNode prev = null;
        ListNode current_node = head;
        
        while( m > 1){
         prev = current_node;
         current_node = current_node.next;
         m--;
         n--;
        }
        
        ListNode connection = prev;
        ListNode tail = current_node;
        
        while( n > 0){
          ListNode next_node = current_node.next;
          current_node.next = prev;
          prev = current_node;
          current_node = next_node;
          n--;
        
        }
        
        if(connection !=null ){
           connection.next = prev;         
        } else {
            head = prev;
        }
        
        tail.next = current_node;
        return head;
        
    }
}
