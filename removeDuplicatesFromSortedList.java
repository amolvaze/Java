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

// Time complexity : O(n)O(n). Because each node in the list is checked exactly once to determine 

// if it is a duplicate or not, the total run time is O(n)O(n), where nn is the number of nodes in the list.

// Space complexity : O(1)O(1). No additional space is used.

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current_node = head;
        while(current_node !=null && current_node.next !=null){
          if(current_node.val == current_node.next.val){
             current_node.next = current_node.next.next;
          }
            else{
             current_node = current_node.next;
            }
        }
         return head;
        
    }
}
