import java.util.*;
// code to find out the subrray in a given sum of integers.

class Main {

  public static boolean findSubArray(int[] A, int sum){

      Set<Integer> set = new HashSet<>();
      set.add(0);
      int sum_so_Far = 0;
      for(int i : A){
        sum_so_Far += i;
        if(set.contains(sum_so_Far - sum)){
           return true;
        }

        set.add(sum_so_Far);

      }
      return false;
  }



  public static void main(String[] args) {
    //System.out.println("Hello world!");
    	int arr[] = { 0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10 };
	    int sum = -30;
      //int n = sizeof(arr) / sizeof(arr[0]);
     if(findSubArray(arr, sum)){
      System.out.println("Subarray with the given sum exists. ");
     }
    else {
      System.out.println("Subarray with the given sum does not exists.");
    }
  }
}