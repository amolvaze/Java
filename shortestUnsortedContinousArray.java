import java.util.*;

//code to return Shortest Unsorted Continuous Subarray length

// Linear time solution - O(n)


//Input: [2, 6, 4, 8, 10, 9, 15]
//Output: 5
//Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.

class Main {

  public static int findUnsortedSubarray(int[] nums) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    // update min value
    for(int i= 0; i< nums.length-1; i++)
    {
       if(min > nums[i])
       {
         min = Math.min(min, nums[i]);
       }
    }
   
    // update max value
     for(int i= nums.length-1; i> 0;i--)
    {
       if(max < nums[i])
       {
         max = Math.max(max, nums[i]);
       }
    }
  
   int l =0, r = 0;
   for(int i=0; i< nums.length; i++)
   {
     if(nums[i] > min)
       {
         l = i;
         break;
       }
   }
   
   for(int i = nums.length-1; i>=0; i--)
   {
      if(nums[i] < max)
       {
         r = i;
         break;
       }
   }

    return r-l >0?r-l+1:0;

  
  }
  public static void main(String[] args) {
    int[] arr = {2, 6, 4, 8, 10, 9, 15};
    System.out.println(findUnsortedSubarray(arr));
  }
}
