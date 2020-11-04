/*
 Input: [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]


To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].

*/

class Main {
   public static void flipAndInvertImage(int[][] A) {
    for(int i=0; i< A.length; i++){
      int low = 0;
      int high = A[i].length-1;
      while(low <=high){
      if(A[i][low] == A[i][high]){
       A[i][low] = 1- A[i][low];
       A[i][low] = A[i][high];
      }
      low++;
      high--;
      }
    }
  for (int i = 0; i<A.length; i++){
     for (int j = 0; j<A[i].length; j++){
      System.out.println(A[i][j]+" ");
     }
}

   }
  public static void main(String[] args) {
    int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
    
    flipAndInvertImage(arr);
    
  }
}
