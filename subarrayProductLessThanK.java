import java.util.*;

// code for subarray product less than k

// Time Complexity: O(N)O(N), where NN is the length of nums. left can only be incremented at most N times.

// Space Complexity: O(1)O(1), the space used by prod, left, and ans.


class Main {

 public static int numSubarrayProductLessThanK(int[] nums, int k) {
   
   if(k <=1) return 0;
    
    int result =0;
    int prod = 1;
    int left= 0;
    int right = 0;

    while (right < nums.length){
      prod *= nums[right];
      
       while( prod >=k)
       { 
         prod /= nums[left];
         left++ ;
       }
 
     result += right-left+1;
     right++;

    }
  
  return result;
 }

  public static void main(String[] args) {
   int[] arr = {10,5,2,6};
   int k = 100;
    System.out.println(numSubarrayProductLessThanK(arr, k));
  }
}
