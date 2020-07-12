import java.util.*;
//code to find the min in rotated sorted array.
// Using a binary search log n approach

class Main {
  public static int minRotatedSorted(int[] nums) {
    if(nums.length == 0) return -1;
    if(nums.length == 1) return nums[0];
    int left = 0;
    int right = nums.length-1;
    while (left < right) 
    {
      int midpoint = left + (right - left) /2;
      if(midpoint > 0 && nums[midpoint] < nums[midpoint -1])
      {
        return nums[midpoint];
      }
      else if(nums[left] <= nums[midpoint] && nums[midpoint] > nums[right]) 
      {
        left = midpoint + 1;
      }
      else 
      {
        right = midpoint-1;
      }

    }
    return nums[left];
  }
  public static void main(String[] args) {
   // int[] arr = {3,4,5,1,2};
    int[] arr = {4,5,6,7,0,1,2};
    System.out.println(minRotatedSorted(arr));
  }
}
