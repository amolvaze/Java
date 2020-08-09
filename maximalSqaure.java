import java.util.*;
// code for maximal square
// Time and space complexity - O(m*n)
/*
Input: 

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0

Output: 4
*/
class Main {
  public static int maximalSquare(char[][] matrix) {
        if(matrix.length == 0)
            return 0;
        int max=0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] dp = new int[rows][cols];
        for(int i=0; i< rows; i++)
        {
          dp[i][0] = matrix[i][0]=='0'?0:1;
          max = Math.max(max, dp[i][0]);
        }
          for(int i=0; i< cols; i++)
        {
          dp[0][i] = matrix[0][i]=='0'?0 :1;
          max = Math.max(max, dp[0][i]);
        }
        
        for(int i=1; i< rows; i++){
           for(int j=1; j< cols; j++) {
               if(matrix[i][j] == '1')
               {
dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j]), dp[i - 1][j - 1]) + 1;
          max = Math.max(max, dp[i][j]);         
               }
           }            
        }
      return max*max;  
        
    }
  public static void main(String[] args) {
    char[][] arr = {
{1,0,1,0,0},
{1,0,1,1,1},
{1,1,1,1,1},
{1,0,0,1,0}
    };

System.out.println(maximalSquare(arr));

  }
}
// -----------------------------------O(n) Solution ------------------------------------------------------
  
// Another array which stores elements in a row is used for dp.

  class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0)
            return 0;
       int rows = matrix.length, cols = rows > 0 ? matrix[0].length : 0;
        int[] dp = new int[cols + 1];
        int maxsqlen = 0, prev = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                int temp = dp[j];
                if (matrix[i - 1][j - 1] == '1') {
                    dp[j] = Math.min(Math.min(dp[j - 1], prev), dp[j]) + 1;
                    maxsqlen = Math.max(maxsqlen, dp[j]);
                } else {
                    dp[j] = 0;
                }
                prev = temp;
            }
        }
        return maxsqlen * maxsqlen;
        
    }
}
  
