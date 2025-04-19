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

// To find the next greater node in the LinkedList.

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> node= new ArrayList();
        ListNode current = head;
        while(current != null){
            node.add(current.val);
            current = current.next;
        }

        int[] output = new int[node.size()];
        Stack<Integer> stack = new Stack();

        for(int i=0; i < node.size(); i++){
            while(!stack.isEmpty() && node.get(stack.peek())< node.get(i)) {
                output[stack.pop()] = node.get(i);
            }
            stack.push(i);
        }

        return output;
    }
}
