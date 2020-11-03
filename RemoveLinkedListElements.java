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
 
 // Code to remove Linked List elements. for ex
 //Input:  1->2->6->3->4->5->6, val = 6
  //Output: 1->2->3->4->5
 
 
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
        while(head!=null && head.val == val){
            head = head.next;
        }
        
        ListNode current_node = head;
        while(current_node!=null && current_node.next !=null){
            if(current_node.next.val == val){
                current_node.next= current_node.next.next;
            }
            else {
                current_node = current_node.next;
            }
        }
        return head;
    }
}
