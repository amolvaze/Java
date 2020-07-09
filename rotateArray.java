import java.util.*;
// code to rotate array to the right by k steps where k is non-negative
// O(n) time
class Main {
   public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
     public static void reverse(int[] nums, int start, int end) {
            while(start <  end){
           int temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
           start++;
           end--;
            }        
     }
  public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6,7};
    int k =3;
    rotate(nums, k);
      for(int i=0; i< nums.length; i++) {
          System.out.println(nums[i]);
            }
  }
}

//Constraints:

//1 <= nums.length <= 2 * 10^4
//It's guaranteed that nums[i] fits in a 32 bit-signed integer.
//k >= 0

// Logic - 3 calls to reverse  - first one to reverse entire array, second one to reverse only first k elements and third one is for to reverse the remaining array elements after 
second reverse call.
                                   




