import java.util.*;

// code for search insert position

//Example 1:

//Input: [1,3,5,6], 5
//Output: 2
//Example 2:

//Ex-2
Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0

class Main {
   public static int searchInsert(int[] nums, int target) {
    int left = 0;
    int right = nums.length-1;

    while(left <= right) 
    {
      int midpoint = left + (right -left)/2;
      if(nums[midpoint] == target) 
       {
         return midpoint;
       }
       else if(target > nums[midpoint])
       {
         left = midpoint + 1;
       }
       else
       {
         right = midpoint -1;
       }
    }

    return left;

   }

  public static void main(String[] args) {
    int[] arr= {1,3,5,6};
    int target = 5;
    System.out.println(searchInsert(arr, target));
  }
}
