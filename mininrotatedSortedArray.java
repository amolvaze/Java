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

// To find the min in rotated sorted array when array has the duplicates.

class Solution {
 // private static int[] removeDuplicates(int[] num) {
  //   Set<Integer> set = new HashSet();
  //        for(int i:num){
  //           set.add(i);
  //       }
  //     return num;
  // }
 
   // Modified above function - now working properly!
  private static int[] removeDuplicates(int[] nums) {
    int i = 0;
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
           i++;
            nums[i] = nums[j];
        }
   }
    return nums;
}
  public int findMin(int[] nums) {
       int[] result = removeDuplicates(nums);
        if(result.length == 0) return 0;
        if(result.length == 1) return nums[0];
        int left = 0;
        int right = result.length-1;
        while(left < right) {
         int mid  = left + (right-left) /2;
        if(mid > 0 && result[mid] < result[mid-1]){
            return result[mid];
        } else if(result[left] <= result[mid] && result[mid] > result[right]){
            left = mid + 1;
        } else {
            right = mid - 1;
        }
        }
        
        return result[left];
    }
}
