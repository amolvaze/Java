import java.util.*;

// code to return peak index in a mountain array.


//Input: [0,1,0]
//Output: 1  

//Input: [0,2,1,0]
//Output: 1


class Main {
  // o(n) linear time solution
   public static int peakIndexInMountainArray(int[] A) { 
    int i=0;
    while(A[i] < A[i+1]) i++;
    return i;
   }
   // O(log n ) using binray search
    public static int peakIndexInMountainArrayBetter(int[] A) {
        int left =0;
        int right = A.length-1;
    while(left< right) {
       int midpoint = left + (right-left)/2;
       if(A[midpoint] < A[midpoint+1]){
         left = midpoint+1;
       }
       else {
         right = midpoint;
       }
    
        }
    return left;
    //return right;
    }

  public static void main(String[] args) {
    //int[] arr = {0,1,0};
    int[] arr = {0,2,1,0};
   // System.out.println(peakIndexInMountainArray(arr));
    System.out.println(peakIndexInMountainArrayBetter(arr));

  }
}
