import java.util.*;

// code to find the peak element of an array
class Main {
  public static int findPeakElement(int[] nums) { 
    if(nums.length == 0) 
     return -1;
    
    // using binary search approach for log n
    int left=0;
    int right = nums.length-1;
    while(left < right) 
    {
       int mid = left + (right-left)/2;
        if(nums[mid] < nums[mid+1])
         {
           left = mid + 1;
         }
         else
         {
           right = mid;
         }
    }

    return left;

  }

  public static void main(String[] args) {
    //int[] arr = {1,2,3,1};
    //int[] arr = {1,2,1,3,5,6,4};
    int[] arr = {};
    System.out.println(findPeakElement(arr));
  }
}
