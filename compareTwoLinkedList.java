// Hacker rank

// Recusrive solution

/* 
 Sample Input

2
2
1
2
1
1
2
1
2
2
1
2
Sample Output

0
1
*/

 static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
  
    if(head1== null && head2 == null) return true;
    if(head1 == null && head2 != null) return false;
    if(head1 != null && head2 == null) return false;
    if(head1.data != head2.data) return false;
    
    return compareLists(head1.next, head2.next);

    }
