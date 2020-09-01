import java.util.*;

// code to find the max consecutive ones using 2 poiters sliding window approach.

class Main {
    public static int longestOnes(int[] A, int k) {
     int i=0;
     int j=0;
     while( i < A.length)
     {
       if(A[i] == 0) k--;
       if(k < 0 && A[j++] == 0) k++;
       i++; 
     } 
     return i-j;
    }

  public static void main(String[] args) {
    int k= 2;
    int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
    System.out.println(longestOnes(arr, k));
  }
}
