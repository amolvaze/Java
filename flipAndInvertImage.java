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
