// Given a singly linked list, determine if it is a palindrome.

//Input: 1->2
//Output: false

//Input: 1->2->2->1
//Output: true

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
 
 // Logic here is that whenver slow ptr reaches to the middle of the linked list we move fast point to the head again
 // After that we can reverse second half of the LinkedList using slow which is at the middle of the list now.
 // Then when we reverse and compare to see if they both are the same.
 // example - a typical list would become like this 3-->2-->1--3-->2-->1 ...it is a palindrome.
 
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast!=null && fast.next!=null) 
        {
             slow= slow.next;
             fast= fast.next.next;
        }
        
        slow = reverse(slow);
        fast = head;
        
        while(slow!=null) 
        {
             if(slow.val!=fast.val){
                 return false;
        
             } 
           slow = slow.next;
           fast= fast.next;
        }
        
      return true;  
        
    }
    
    // code to revese Linked List.
    public ListNode reverse(ListNode head) {
        
        ListNode prev = null;
        while(head!=null) {
         ListNode next_node = head.next;
         head.next = prev;
         prev = head;
         head = next_node;   
        }
        
        return prev;
    }   
     
}
