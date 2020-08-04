import java.util.*;

// cGiven an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.

// Time and space complexity - O(n)- dynamic programming approach. 

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
//  0   1  2   3  4   5
// [-2, 0, 3, -5, 2, -1]
//  0   -2 -2  1  -4  -2  -3

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
        return dp[j+1]-dp[i]; // This sum will take O(1) each time.
    } 

  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}
