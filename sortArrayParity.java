import java.util.*;

// code to return sorted array by parity

class Main {
  public static void sortArrayByParity(int[] A) {
        int i=0;
        int j = A.length-1;
        
        while(i < j) {
        if(A[i] % 2 > A[j] % 2) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
           
         if(A[i]%2 == 0) i++;
         if(A[j]%2 == 0) j--;
            
        }
      for(int m= 0; m < A.length; m++) {
         System.out.print(A[m]+" ");
     }
       // return A;
    }
  public static void main(String[] args) {
  int[] arr = {3,1,2,4};
  sortArrayByParity(arr);
  
  }
}
