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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode sumHead = new ListNode(-1);
        int sum=0, carry=0, v1=0,v2=0;
        ListNode ptr = sumHead;
        
        while(l1 !=null || l2!=null)
        {
            if(l1!=null)
            {
                v1 = l1.val;
                l1 = l1.next;
            } else v1 =0;
            if(l2 !=null)
            {
                v2 = l2.val;
                l2= l2.next;
            }else v2=0;
            sum = v1+v2+carry;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            ptr.next = temp;
            ptr = ptr.next;
            
            
        }
        if(carry !=0)
            {
             ListNode temp = new ListNode(carry);
            ptr.next = temp;
           
            
            }
        return sumHead.next;
    }
}
