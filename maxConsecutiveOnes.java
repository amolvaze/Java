import java.util.*;

// Code to find the max consecutive ones.

// Time Complexity - O(n)
// Space Complexity - O(n)

class Main {
   public static int findMaxConsecutiveOnes(int[] nums) {
      if(nums == null || nums.length ==0) return 0;
      int max =0;
     int no_of_ones= 0;
    for(int i=0; i< nums.length; i++)
    {
      if(nums[i] == 1)
      {
       no_of_ones += 1;
       max = Math.max(max, no_of_ones);
      }
      else
      {
        no_of_ones =0;
      }
    }

     return max; 
   }
  public static void main(String[] args) {
    int[] arr = {1,1,0,1,1,1};
    System.out.println(findMaxConsecutiveOnes(arr));
  }
}
