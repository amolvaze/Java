import java.util.*;

// code to return k closest point to the origin - using a Priority Queue.

// Time complexity = O(n log k)
// Space complexity - O(k+1)

class Main {
  public int[][] kClosest(int[][] points, int K) {
  
   PriorityQueue<int[]> pq = new PriorityQueue<>(
     new Comparator() {
       public int compare(int[] a, int[] b)
       {
return ((b[0]*b[0] + b[1]*b[1])- (a[0] *a[0] + a[1]* a[1]));  
       }
     });

    for(int[] p : points)
     {
       pq.add(p);
       while(pq.size() > K)
       {
         pq.poll();
       }
     } 

   int[][] result = new int[K][2];
   int i = 0;
   while(!pq.isEmpty())
   {
     result[i] = pq.poll();
     i++;
   }

   return result;

  }
