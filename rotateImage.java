import java.util.*;
// code to rotate a given an n x n 2D matrix representing an image.
class Main {
   public static void rotateImage(int[][] matrix) {
        
      int N = matrix.length;
     for(int i =0; i< N; i++) {
          for(int j=i; j< N; j++) {
              int temp = matrix[i][j];
              matrix[i][j] = matrix[j][i];
              matrix[j][i]= temp;
          }
     }
        
      for(int i=0;i< N; i++) {
          for(int j=0; j< (N/2); j++) {
              int temp = matrix[i][j];
              matrix[i][j] = matrix[i][N-j-1];
              matrix[i][N-j-1] = temp;
          }
      }  
        
    }
  public static void main(String[] args) {
    int[][] arr ={
  {1,2,3},
  {4,5,6},
  {7,8,9}
    };
   
   rotateImage(arr);
  for (int i = 0; i < arr.length; ++i) {
      for(int j = 0; j < arr[i].length; ++j) {
        System.out.println(arr[i][j]+" ");
      }
    }

  }
}
