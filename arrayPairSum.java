import java.util.*;

// code for array partition
// using sort utility and so in n log n time.

// Input: [1,4,3,2] and Output = 4

class Main {
   
   public static int arrayPairSum(int[] nums) { 
    Arrays.sort(nums);
    int sum =0;
    for(int i=0; i< nums.length-1; i+=2) {
      sum += nums[i];
    }
    return sum;
   }

  public static void main(String[] args) {
    int[] arr = {1,4,3,2};
    System.out.println(arrayPairSum(arr));
  }
}
