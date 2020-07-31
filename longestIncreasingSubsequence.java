import java.util.*;

// code to return longest increasing subsequence in given array

// Dynamic programming - O(n^2) solution.

class Main {
   
   public static int lengthOfLIS(int[] nums) {
          if(nums.length <= 1)
          return nums.length;
    int[] dp = new int[nums.length];
    int max =-1;
    Arrays.fill(dp,1);
    for(int i=1; i< nums.length; i++)
    {
      for(int j=0; j< i; j++)
       {
         if(nums[j] < nums[i])
         {
        dp[i] = Math.max(dp[i], dp[j] + 1);
         }
       }
      max = Math.max(max, dp[i]); 
    }
   return max;
   }
  public static void main(String[] args) {
   int[] arr = {10,9,2,5,3,7,101,1};
   System.out.println(lengthOfLIS(arr));
  }
}
