// Dynamic Programming House Robber problem

// Time Complexity - O(n) and Space Complexity - O(n^2) due to dp array.

import java.util.*;

class Main {

  public static int rob(int[] nums) { 
      if(nums.length == 0) return 0;
      int[] dp = new int[nums.length+1];
      dp[0] = 0;
      dp[1] = nums[0];
      for(int i=1; i< nums.length; i++){
        dp[i+1] = Math.max(dp[i] , nums[i]+dp[i-1]);
      }
     return dp[nums.length];
  }
  public static void main(String[] args) {
    int[] arr = {2,7,9,3,1};
    System.out.println(rob(arr));
  }
}
