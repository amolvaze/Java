import java.util.*;

// code to return running sum of given 1 D array.

class Main {

  public static int[] runningSum(int[] nums) { 
    int runningSum = 0;
    int index = 0;
    for(int i=0; i< nums.length; i++)
    {
      runningSum += nums[i];
      nums[index++] = runningSum;
    }
 
   return nums;
  
  }
  public static void main(String[] args) {
    int[] arr = {1,2,3,4};
    System.out.println(runningSum(arr));
  }
}
