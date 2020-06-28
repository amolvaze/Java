// code to sort k-sorted array using min heap or priority queue

// Time complexity for this code would be O(n log k) where log n for each insertion and k auxilary space.

import java.util.*;
class Main {
 
  // function to print sorted k-sorted array 
   public static void ksorted(List<Integer> list, int k) {
     
 	PriorityQueue<Integer> pq = new PriorityQueue<>(list.subList(0, k+1));
   int index = 0;
  for(int i=k+1; i< list.size(); i++) {
      
      list.set(index++, pq.poll());
      pq.add(list.get(i));
  }
      while(!pq.isEmpty()){
        list.set(index++, pq.poll());
      }

   }

  public static void main(String[] args) {
   // System.out.println("Hello world!");
   List<Integer> a = Arrays.asList(1,4,5,6,44,3,67);
   int k =5;
   ksorted(a, k);
   System.out.println(a);

  }
}