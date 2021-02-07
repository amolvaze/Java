import java.util.*;

// code to find the maximum subarray. It should be from consecutive array elements in given array

// O(n) linear time solution

class Main {
 
 public static int findMaxSubarray(int[] a) {
   int maxSum = a[0];
   int currentSum = maxSum; 
   for(int i=0; i< a.length; i++){
  currentSum = Math.max(currentSum + a[i], a[i]);
  maxSum = Math.max(currentSum, maxSum);   
   } 
   return maxSum;
 }

  public static void main(String[] args) {
    int[] a = {-2,2,5,-11,6,2,0};
    System.out.println(findMaxSubarray(a));
  }
}
