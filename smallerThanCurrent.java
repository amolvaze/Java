import java.util.*;
// code to return output array which contains all the numbers smaller than current no for each element in an array.
// O(3n) ~ O(n)

class Main {
 
  public static void smallerThanCurrent(int[] a) {
  
  if(a.length == 0) { 
    System.out.println("Input array is empty: ");
    //return new int[0];
    return;
  }
   int[] count = new int[256];
   int[] resultArray = new int[a.length];
 // loop thru given array & increment counter
  for(int i=0; i< a.length; i++) {
     count[a[i]]++;
  }
 
 for(int i=1; i< 100; i++) {
   count[i] += count[i-1];
 }

 for(int i=0; i< a.length; i++) {
      if(a[i] == 0) {
        resultArray[i] =0;
      }
      else {
        resultArray[i] = count[a[i] -1];
      }
 }

 for(int j=0; j< resultArray.length; j++) {
   System.out.println(resultArray[j]);
 }
  }
  
  public static void main(String[] args) {
   int[] arr = {};
   //System.out.println(smallerThanCurrent(arr));
   smallerThanCurrent(arr);
  }
}
