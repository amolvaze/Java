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

// To sort split the list into two halves and using merge sort to merge the sorted list back and return it.

// Using O(n log n) time complexity and a constant space complexity.
//Input: 4->2->1->3 and Output: 1->2->3->4

class Solution {
    public ListNode sortList(ListNode head) {
        
        // if head is null it is alreayd sorted so return.
        if(head == null || head.next == null) { return head; }
        
        // maintaining pointers  
        ListNode temp =  head;
          ListNode slow = head;
          ListNode fast = head;
        
        while(fast!=null && fast.next!=null){
            temp = slow;
            slow= slow.next;
            fast= fast.next.next;
        }
        
        temp.next = null;
        
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        
        return merge(left,right);
        
    }
    
    // fucntion to merge using merge sort and then return merge sorted list.
    
    public ListNode merge(ListNode l1, ListNode l2) {
        
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        
        while(l1!=null && l2!=null) {
            if(l1.val < l2.val) {
                current.next= l1;
                l1= l1.next;
            }
            else{
                current.next = l2;
                l2= l2.next;
            }
          current = current.next;  
        }
        
        if(l1!=null) {
            current.next=l1;
            l1=l1.next;
        }
        
        if(l2!=null) {
           current.next =l2;
            l2= l2.next;
        }
        
        return temp.next;
    }
    
    
    
}
