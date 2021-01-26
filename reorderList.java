// Given a singly linked list L: L0→L1→…→Ln-1→Ln,
// reorder it to: L0→Ln→L1→Ln-1→L2→Ln-2→…

// You may not modify the values in the list's nodes, only nodes itself may be changed.

// Example 1:

// Given 1->2->3->4, reorder it to 1->4->2->3.
// Example 2:

// Given 1->2->3->4->5, reorder it to 1->5->2->4->3.

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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        
        // head of first half
        ListNode l1 = head;
        
        //head of second half
        ListNode slow = head;
        
        //tail of second half
        ListNode fast = head;
        
        //tail of first half
        ListNode prev = null;
        
        while(fast != null && fast.next != null){
            prev= slow;
            slow = slow.next;
            fast= fast.next.next;
            
        }
        
        prev.next =null;
        
        ListNode l2 = reverse(slow);
        
        merge(l1,l2);
        
        
    }
    
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        
        while(current != null){
          
         ListNode next_node = current.next;
         current.next = prev;
         prev = current;
         current = next_node;
            
        }
            
       return prev;
                 
            
    }
    
    public void merge(ListNode l1, ListNode l2){
        while(l1 != null){
          ListNode l1_next = l1.next;
          ListNode l2_next = l2.next;
           l1.next = l2;
          
            if(l1_next == null){
                break;
            }
            
            l2.next = l1_next;
            l1= l1.next;
            l2= l2.next;
            
        }
    }
    
    
}
