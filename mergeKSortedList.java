import java.util.*;

// Code to return k merge sorted list

// Time complexity - O(nk)

//Input:
//[
//  1->4->5,
 // 1->3->4,
 // 2->6
// ]
// Output: 1->1->2->3->4->4->5->6

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

public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode current = dummy;
        for(int i = 0; i<lists.length; i++){
            current = mergeLists(current, lists[i]);
        }
        return dummy.next;
    }
    
    public ListNode mergeLists(ListNode l1, ListNode l2){
     ListNode prehead = new ListNode(Integer.MIN_VALUE);
        ListNode prev = prehead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        
        prev.next = l1 == null ? l2: l1;
        return prehead.next;
    }
}
