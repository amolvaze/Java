import java.util.*;


// code to find the kth largest element from an array
// O(n + k log n) - Time complexity using a MaxHeap or Priority Queue.

class Main {

 public static int findkthLargest(List<Integer> list, int k) {  
      PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b-a); // use of a comparator

     q.addAll(list);

     while(--k > 0) {
       q.poll();
     }
   
      return q.peek();

 }

public static void main(String[] args) {
 List<Integer> list = Arrays.asList(7,9,48, 45,100,0);
 int k = 3;
 System.out.println(findkthLargest(list , k) );

  }
}

// Another approach --similar to above

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ele: nums){
            pq.add(ele);
            if(pq.size() > k){
               pq.poll();
            }
        }
        return pq.poll();
    }
}
