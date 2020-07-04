import java.util.*;

// code to find out the missing no for given array of 0 to n integers


class Main {
  public static int findMissing(int[] a) {
  // using xor approach in O(n) time
  int missingNo =  a.length;
  //System.out.println("Initially -"+missingNo);
  for(int i= 0; i< a.length; i++){
 // System.out.println("Initially -"+missingNo);
   missingNo ^= i ^ a[i];
  //System.out.println(i+" "+a[i]+" "+missingNo);
  }
     return missingNo;
  }

  public static void main(String[] args) {
  int[] arr = {3,0,1};
   //int[] arr = {9,6,4,2,3,5,7,0,1};
   System.out.println(findMissing(arr));
  }
}
 
//  1 XOR 1 = 0 
 // 1 XOR 0 = 1 // no itself
