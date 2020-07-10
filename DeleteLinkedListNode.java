// A linked list node
class Node
{
	int data;
	Node next;

	Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

class Main
{
	// Helper function to print given linked list
	public static void printList(Node head)
	{
		Node ptr = head;
		while (ptr != null)
		{
			System.out.print(ptr.data + " -> ");
			ptr = ptr.next;
		}

		System.out.println("null");
	}

 // fucntion to delete given node in linked list
public static void delete(Node head, int data) {
 // consider base case if head is null
 Node t1= head;
 if(head == null) {
  System.out.println(" Given linked list is an empty: "); 
 }

// if the element or data to be deleted happens to be the first node or head node

if(t1!=null && t1.data == data) {
head = t1.next;
//System.out.println("Data.." +t1.data);
 return;
}
// if the node to be deleted not happens to be the first node
Node temp = head;
while(temp.next != null) {
 Node remove = temp.next;
 temp.next= temp.next.next;
}
temp = temp.next;
System.out.println(" Given key is not found in the linked list: "); 
printList(head);
}

	// reverse linked list iteratively
	public static void main(String[] args)
	{
		// input keys
		int[] keys = { 1, 2, 3, 4, 5, 6 };

		Node head = null;
		for (int i = keys.length - 1; i >= 0; i--) {
			head = new Node(keys[i], head);
		}

		printList(head);
    int data = keys[0];
   //System.out.println("DATA--> " +data);
    delete(head, data);
    //printList(head);
	}
}
//---------------------- Leetcode solution----------------------------
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next= node.next.next;
    }
}


