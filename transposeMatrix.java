import java.util.*;
// code to return transpose of given matrix.
// constraints
//1 <= A.length <= 1000
//1 <= A[0].length <= 1000
class Solution {
    public int[][] transpose(int[][] A) {
       if(A.length == 0) return new int[0][0];
        int rows = A.length;
        int columns = A[0].length;
        int[][] resultMatrix = new int[columns][rows];
        // loop through input given matrix
        for(int i=0; i< rows; i++) {
            for(int j=0; j< columns; j++) 
            {
                resultMatrix[j][i] = A[i][j];
            }
        }
        return resultMatrix;
        
    }
}
//------------------------------------------------Using Void method----------------------------------

import java.util.*;
// code to return transpose of given matrix.
// constraints
//1 <= A.length <= 1000
//1 <= A[0].length <= 1000
class Main {
 public static void transpose(int[][] A) {
  int rows = A.length;
  int columns = A[0].length;
  int[][] resultArray = new int[columns][rows];
  // Loop thru given input array matrix
  for(int i=0; i< rows; i++) 
  {   for(int j=0; j< columns; j++) 
         {
            resultArray[j][i] = A[i][j];
         }  
  }

  for (int i = 0; i < resultArray.length; ++i) {
      for(int j = 0; j < resultArray[i].length; ++j) {
        System.out.println(resultArray[i][j]);
      }
  }
 }

  public static void main(String[] args) {
    int[][] arr = {
                 {1,2,3},{4,5,6},{7,8,9}
    };

   transpose(arr);

  }
}
