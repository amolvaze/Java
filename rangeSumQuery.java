import java.util.*;

// cGiven an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

// Time and space complexity - O(n)- dynamic programming approach. 

class Main {
  int[] dp;
  public NumArray(int[] nums) {
    int n = nums.length;
    dp = new int[n+1];
    for(int i=1; i<=n; i++)
    {
      dp[i] = dp[i-1] + nums[i-1];
    }
  }
 
  public int sumRange(int i, int j) {
        return dp[j+1]-dp[i];
    } 

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
