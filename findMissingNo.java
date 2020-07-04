import java.util.*;

// code to find out the missing no for given array of 0 to n integers


class Main {
  public static int findMissing(int[] a) {
  // using xor approach in O(n) time
  int missingNo =  a.length;
  for(int i= 0; i< a.length; i++){
   missingNo ^= i ^ a[i];
  }
     return missingNo;
  }

  public static void main(String[] args) {
  //int[] arr = {3,0,1};
   int[] arr = {9,6,4,2,3,5,7,0,1};
   System.out.println(findMissing(arr));
  }
}
