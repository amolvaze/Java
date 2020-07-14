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
        for(int i=0; i< A.length; i++) {
            for(int j=0; j< A.length; j++) 
            {
                resultMatrix[j][i] = A[i][j];
            }
        }
        return resultMatrix;
        
    }
}
