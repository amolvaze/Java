// Code to return min path sum. Time complexity = O(m *n) and space complexity = O(m * n)
//Input:
//[
//  [1,3,1],
//  [1,5,1],
//  [4,2,1]
//]
//Output: 7
//Explanation: Because the path 1→3→1→1→1 minimizes the sum.

import java.util.*;
class Solution {
    public int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=rows-1; i >=0; i--)
        {
            for(int j = cols-1; j>=0; j--)
            {
                if(i == rows-1 && j!= cols-1)
                {
                    dp[i][j] = grid[i][j] + dp[i][j+1];
                }
                else if(i!= rows-1 && j == cols-1)
                {
                    dp[i][j] = grid[i][j] + dp[i+1][j];
                }
                else if(i!= rows-1 && j!= cols-1)
                {
                    dp[i][j] = grid[i][j] + Math.min(dp[i][j+1], dp[i+1][j]);
                }
                else
                {
                    dp[i][j] = grid[i][j];
                }
            }
        }
        
        return dp[0][0];
    }
}
